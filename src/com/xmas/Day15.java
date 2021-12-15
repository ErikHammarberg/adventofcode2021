package com.xmas;

import java.util.*;

public class Day15 {

    public long one(String input) {
        var pathFinder = new PathFinder();
        pathFinder.initOne(input);
        return pathFinder.findPath();
    }

    public long two(String input) {
        var pathFinder = new PathFinder();
        pathFinder.initTwo(input);
        return pathFinder.findPath();
    }



    class PathFinder {
        int[][] edges;
        SortedSet<Node> nodes = new TreeSet<>();
        Map<Point, Node> gridNodes = new HashMap<>();

        void initOne(String input) {
            edges = populateEdges(input);
        }

        void initTwo(String input) {
            edges = populateEdgesForTwo(input);
        }

        long findPath() {

            var initNode = new Node(new Point(0,0), 0);
            nodes.add(initNode);
            gridNodes.put(new Point(0,0), initNode);
            var goalPoint = new Point(edges.length-1, edges[0].length-1);

            do  {
                initNode = nodes.first();
                initNode.addNeighbours();

            } while(!initNode.point.equals(goalPoint));
            return initNode.value;
        }

        int[][] populateEdges(String input) {
            final var inputs = Util.splitInput(input);

            var edgeList = inputs.stream().map(s ->
                s.chars().map(i -> Integer.parseInt(""+(char)i)).toArray()
            ).toList();

            return edgeList.toArray(new int[edgeList.size()][edgeList.get(0).length]);

        }

        int[][] populateEdgesForTwo(String input) {

            var initEdges = populateEdges(input);
            var resultEdges = new int[initEdges.length*5][initEdges[0].length*5];

            for(int num = 0; num < 5; num++) {
                int xAdder = initEdges.length * num;
                int yAdder = initEdges[0].length * num;

                for (int i = 0; i < initEdges.length; i++) {
                    for (int inner = 0; inner < initEdges[0].length; inner++) {
                        resultEdges[i+xAdder][inner] = makeMorphedMod(initEdges[i][inner] , num);
                    }
                }
            }
            for(int x = 0; x < resultEdges.length; x++) {
                for(int y = initEdges.length; y< resultEdges[0].length;y++) {
                    resultEdges[x][y] = makeMorphedMod(resultEdges[x][y - initEdges[0].length], 1);
                }
            }
            return resultEdges;
        }

        int makeMorphedMod(int number, int addition) {
            if (number + addition > 9) {
                return ((number + addition) % 10) + 1;
            }
            return number + addition;
        }



        class Node implements Comparable{
            Point point;
            long value;

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
//                this.value = Integer.MAX_VALUE;
            }

            void addOrUpdateNeighbour(Point p, long value) {
                Node newNode = gridNodes.get(p);
                if(newNode != null) {
                    newNode.updateValue(value);
                } else {
                    newNode = new Node(p, value);
                    nodes.add(newNode);
                    gridNodes.put(p, newNode);
                }
            }

            Node(Point p, long value) {
                point = p;
                this.value = value;
            }

            boolean updateValue(long altPathCost) {
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
                    return (int)(value - other.value);
                }
                return other.point.hashCode() - point.hashCode();
            }
        }
        record Point(int x, int y){}
    }

}
