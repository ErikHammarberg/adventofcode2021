package com.xmas;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Day15 {

    public int one(String input) {
        var pathFinder = new PathFinder();
        return pathFinder.findPath(input);
    }

    class PathFinder {
        int[][] edges;
        SortedSet<Node> nodes = new TreeSet<>();
        Map<Point, Node> gridNodes = new HashMap<>();

        int findPath(String input) {
            populateEdges(input);
            var initNode = new Node(new Point(0,0), 0);
            nodes.add(initNode);
            gridNodes.put(new Point(0,0), initNode);
            var goalPoint = new Point(edges.length-1, edges[0].length-1);

            do  {
                initNode.addNeighbours();
                initNode = nodes.first();
            } while(!initNode.point.equals(goalPoint));
            return initNode.value;
        }

        void populateEdges(String input) {
            final var inputs = Util.splitInput(input);

            var edgeList = inputs.stream().map(s ->
                s.chars().map(i -> Integer.parseInt(""+(char)i)).toArray()
            ).toList();
            edges = edgeList.toArray(new int[edgeList.size()][edgeList.get(0).length]);

//            for(int i = 0; i < inputs.size(); i ++) {
//                for(int inner = 0; inner < inputs.get(0).length(); inner++) {
//
//                }
//            }
        }



        class Node implements Comparable{
            Point point;
            int value;

            void addNeighbours() {
                Node newNode = null;
                if(point.x > 0) {
                    addOrUpdateNeighbour(new Point(point.x-1, point.y ), value + edges[point.x-1][point.y]);
                }
                if(point.x +1 < edges.length) {
                    addOrUpdateNeighbour(new Point(point.x+1, point.y ), value + edges[point.x+1][point.y]);
                }
                if(point.y > 0) {
                    addOrUpdateNeighbour(new Point(point.x, point.y-1 ), value + edges[point.x][point.y-1]);
                }
                if(point.y+1 < edges[0].length) {
                    addOrUpdateNeighbour(new Point(point.x, point.y+1 ), value + edges[point.x][point.y+1]);
                }
                nodes.remove(this);
                this.value = Integer.MAX_VALUE;
            }

            void addOrUpdateNeighbour(Point p, int value) {
                Node newNode = gridNodes.get(p);
                if(newNode != null) {
                    newNode.updateValue(value);
                } else {
                    newNode = new Node(p, value);
                    nodes.add(newNode);
                    gridNodes.put(p, newNode);
                }
            }

            Node(Point p, int value) {
                point = p;
                this.value = value;
            }

            boolean updateValue(int altPathCost) {
                if (altPathCost < value) {
                    value = altPathCost;
                    nodes.remove(this);
                    nodes.add(this);
                    return true;
                }
                else return false;
            }

            @Override
            public int compareTo(Object o) {
                var other = (Node)o;
                if(other.value - value != 0) {
                    return value - other.value;
                }
                return other.point.hashCode() - point.hashCode();
            }
        }
        record Point(int x, int y){}
    }

}
