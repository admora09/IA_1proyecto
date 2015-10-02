/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

final public class GraphAStar implements Iterable<BabMatrix> {
    /*
     * A map from the nodeId to outgoing edge.
     * An outgoing edge is represented as a tuple of NodeData and the edge length
     */
    private final Map<BabMatrix, Map<NodeData, Double>> graph;
    /*
     * A map of heuristic from a node to each other node in the graph.
     */
    private final BabMatrix destination;
    /*
     * A map between nodeId and nodedata.
     */
    private final Map<BabMatrix, NodeData> nodeIdNodeData;

    public GraphAStar(BabMatrix destination) {
        if (destination == null) throw new NullPointerException("The huerisic map should not be null");
        graph = new HashMap<>();
        nodeIdNodeData = new HashMap<>();
        this.destination = destination;
    } 

    /**
     * Adds a new node to the graph.
     * Internally it creates the nodeData and populates the heuristic map concerning input node into node data.
     * 
     * @param nodeId the node to be added
     */
    public void addNode(BabMatrix nodeId) {
        if (nodeId == null) throw new NullPointerException("The node cannot be null");

        graph.put(nodeId, new HashMap<>());
        nodeIdNodeData.put(nodeId, new NodeData(nodeId, getHeuristicMap(nodeId)));
    }
    
    private void addNode(BabMatrix nodeId, NodeData parent, double distance){
        if (nodeId == null) throw new NullPointerException("The node cannot be null");

        graph.put(nodeId, new HashMap<>());
        nodeIdNodeData.put(nodeId, new NodeData(nodeId, parent, distance));
    }
    
    private Map<BabMatrix, Double> getHeuristicMap(BabMatrix matrix){
        Map<BabMatrix, Double> result = new HashMap<>();
        
        List<BabMatrix> states = matrix.generateStates();
        for (BabMatrix state : states){
            double h = Heuristic.calcH(matrix, destination);
//            addNode(state);
//            addEdge(matrix, state, h);
            result.put(state, h);
        }
        
        return result;
    }

    /**
     * Adds an edge from source node to destination node.
     * There can only be a single edge from source to node.
     * Adding additional edge would overwrite the value
     * 
     * @param nodeIdFirst   the first node to be in the edge
     * @param nodeIdSecond  the second node to be second node in the edge
     * @param length        the length of the edge.
     */
    public void addEdge(BabMatrix nodeIdFirst, BabMatrix nodeIdSecond, double length) {
        if (nodeIdFirst == null || nodeIdSecond == null) throw new NullPointerException("The first nor second node can be null.");

        if (!graph.containsKey(nodeIdFirst) || !graph.containsKey(nodeIdSecond)) {
            throw new NoSuchElementException("Source and Destination both should be part of the part of graph");
        }

        graph.get(nodeIdFirst).put(nodeIdNodeData.get(nodeIdSecond), length);
        graph.get(nodeIdSecond).put(nodeIdNodeData.get(nodeIdFirst), length);
    }

    /**
     * Returns immutable view of the edges
     * 
     * @param nodeId    the nodeId whose outgoing edge needs to be returned
     * @return          An immutable view of edges leaving that node
     */
    public Map<NodeData, Double> edgesFrom (BabMatrix nodeId) {
        if (nodeId == null) throw new NullPointerException("The input node should not be null.");
        if (!graph.containsKey(nodeId)) throw new NoSuchElementException("The node should not be null.");

        return Collections.unmodifiableMap(graph.get(nodeId));
    }

    /**
     * The nodedata corresponding to the current nodeId.
     * 
     * @param nodeId    the nodeId to be returned
     * @return          the nodeData from the 
     */ 
    public NodeData getNodeData (BabMatrix nodeId) {
        if (nodeId == null) { throw new NullPointerException("The nodeid should not be empty"); }
        if (!nodeIdNodeData.containsKey(nodeId))  { throw new NoSuchElementException("The nodeId does not exist"); }
        return nodeIdNodeData.get(nodeId);
    }

    /**
     * Returns an iterator that can traverse the nodes of the graph
     * 
     * @return an Iterator.
     */
    @Override public Iterator<BabMatrix> iterator() {
        return graph.keySet().iterator();
    }
}
