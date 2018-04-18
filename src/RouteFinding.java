import javafx.util.Pair;

import java.util.ArrayList;

public class RouteFinding {

    //INPUT
    //inital crossing (pair)
    //goal crossing (pair)
    //map of streets and coordinates (text file)

    //OUTPUT
    //route through streets (list of streets)

    public void solve() {

        ArrayList<Node<Pair<Integer,Integer>>> nodes = new  ArrayList<Node<Pair<Integer,Integer>>>();
        ArrayList<Edge<String>> edges = new  ArrayList<Edge<String>>();

        Node<Pair<Integer,Integer>> n1 = new Node<Pair<Integer,Integer>>(1,new Pair<>(10,70));
        Node<Pair<Integer,Integer>> n2 = new Node<Pair<Integer,Integer>>(2,new Pair<>(20,50));
        Node<Pair<Integer,Integer>> n3 = new Node<Pair<Integer,Integer>>(3,new Pair<>(35,35));
        Node<Pair<Integer,Integer>> n4 = new Node<Pair<Integer,Integer>>(4,new Pair<>(25,100));
        Node<Pair<Integer,Integer>> n5 = new Node<Pair<Integer,Integer>>(5,new Pair<>(35,80));
        Node<Pair<Integer,Integer>> n6 = new Node<Pair<Integer,Integer>>(6,new Pair<>(45,70));
        Node<Pair<Integer,Integer>> n7 = new Node<Pair<Integer,Integer>>(7,new Pair<>(55,55));
        Node<Pair<Integer,Integer>> n8 = new Node<Pair<Integer,Integer>>(8,new Pair<>(35,120));
        Node<Pair<Integer,Integer>> n9 = new Node<Pair<Integer,Integer>>(9,new Pair<>(50,90));
        Node<Pair<Integer,Integer>> n10 = new Node<Pair<Integer,Integer>>(10,new Pair<>(60,150));
        Node<Pair<Integer,Integer>> n11 = new Node<Pair<Integer,Integer>>(11,new Pair<>(60,110));
        Node<Pair<Integer,Integer>> n12 = new Node<Pair<Integer,Integer>>(12,new Pair<>(60,100));
        Node<Pair<Integer,Integer>> n13 = new Node<Pair<Integer,Integer>>(13,new Pair<>(70,85));
        Node<Pair<Integer,Integer>> n14 = new Node<Pair<Integer,Integer>>(14,new Pair<>(80,70));
        Node<Pair<Integer,Integer>> n15 = new Node<Pair<Integer,Integer>>(15,new Pair<>(65,100));

        nodes.add(n1);
        nodes.add(n2);
        nodes.add(n3);
        nodes.add(n4);
        nodes.add(n5);
        nodes.add(n6);
        nodes.add(n7);
        nodes.add(n8);
        nodes.add(n9);
        nodes.add(n10);
        nodes.add(n11);
        nodes.add(n12);
        nodes.add(n13);
        nodes.add(n14);
        nodes.add(n15);

        Edge<String> e1 = new Edge<String>(1,"Vestervoldgade",n2,Math.sqrt(2*2+1*1));
        Edge<String> e2 = new Edge<String>(2,"Noerrevoldgade",n4,Math.sqrt(3*3+1.5*1.5));
        Edge<String> e3 = new Edge<String>(3,"SktPedersStraede",n5,Math.sqrt(1*1+2.5*2.5));
        Edge<String> e4 = new Edge<String>(4,"Vestervoldgade",n1,Math.sqrt(2*2+1*1));
        Edge<String> e5 = new Edge<String>(5,"Vestervoldgade",n3,Math.sqrt(1.5*1.5+1.5*1.5));
        Edge<String> e6 = new Edge<String>(6,"Studiestraede",n6,Math.sqrt(2*2+2.5*2.5));
        Edge<String> e7 = new Edge<String>(7,"Vestervoldgade",n2,Math.sqrt(1.5*1.5+1.5*1.5));
        Edge<String> e8 = new Edge<String>(8,"Noerrevoldgade",n1,Math.sqrt(3*3+1.5*1.5));
        Edge<String> e9 = new Edge<String>(9,"TeglgaardsStraede",n5,Math.sqrt(2*2+1*1));
        Edge<String> e10 = new Edge<String>(10,"Noerrevoldgade",n8,Math.sqrt(2*2+1*1));
        Edge<String> e11 = new Edge<String>(11,"SktPedersStraede",n9,Math.sqrt(1*1+1.5*1.5));
        Edge<String> e12 = new Edge<String>(12,"Larsbjoernsstraede",n5,Math.sqrt(1*1+1*1));
        Edge<String> e13 = new Edge<String>(13,"Larsbjoernsstraede",n7,Math.sqrt(1.5*1.5+1*1));
        Edge<String> e14 = new Edge<String>(14,"Studiestraede",n13,Math.sqrt(1.5*1.5+2.5*2.5));
        Edge<String> e15 = new Edge<String>(15,"Vestergade",n3,Math.sqrt(2*2+2*2));
        Edge<String> e16 = new Edge<String>(16,"Noerrevoldgade",n4,Math.sqrt(2*2+1*1));
        Edge<String> e17 = new Edge<String>(17,"Noerrevoldgade",n10,Math.sqrt(3*3+2.5*2.5));
        Edge<String> e18 = new Edge<String>(18,"LarslejStraede",n8,Math.sqrt(3*3+1.5*1.5));
        Edge<String> e19 = new Edge<String>(19,"Noerrevoldgade",n8,Math.sqrt(3*3+2.5*2.5));
        Edge<String> e20 = new Edge<String>(20,"Noerregade",n11,Math.sqrt(3*3+0*0));
        Edge<String> e21 = new Edge<String>(21,"Noerregade",n12,Math.sqrt(1*1+0*0));
        Edge<String> e22 = new Edge<String>(22,"Noerregade",n13,Math.sqrt(1.5*1.5+1*1));
        Edge<String> e23 = new Edge<String>(23,"Noerregade",n14,Math.sqrt(1.5*1.5+1*1));
        Edge<String> e24 = new Edge<String>(24,"Vestergade",n7,Math.sqrt(1.5*1.5+2.5*2.5));
        Edge<String> e25 = new Edge<String>(25,"SktPedersStraede",n9,Math.sqrt(1*1+1.5*1.5));


        edges.add(e1);
        edges.add(e2);
        edges.add(e3);
        edges.add(e4);
        edges.add(e5);
        edges.add(e6);
        edges.add(e7);
        edges.add(e8);
        edges.add(e9);
        edges.add(e10);
        edges.add(e11);
        edges.add(e12);
        edges.add(e13);
        edges.add(e14);
        edges.add(e15);
        edges.add(e16);
        edges.add(e17);
        edges.add(e18);
        edges.add(e19);
        edges.add(e20);
        edges.add(e21);
        edges.add(e22);
        edges.add(e23);
        edges.add(e24);
        edges.add(e25);

        n1.setNeighbourEdges( new Edge[] {e1,e2,e3});
        n2.setNeighbourEdges( new Edge[] {e4,e5,e6});
        n3.setNeighbourEdges( new Edge[] {e7});
        n4.setNeighbourEdges( new Edge[] {e8,e9,e10});
        n5.setNeighbourEdges( new Edge[] {e11});
        n6.setNeighbourEdges( new Edge[] {e12,e13,e14});
        n7.setNeighbourEdges( new Edge[] {e15});
        n8.setNeighbourEdges( new Edge[] {e16,e17});
        n9.setNeighbourEdges( new Edge[] {e18});
        n10.setNeighbourEdges( new Edge[] {e19,e20});
        n11.setNeighbourEdges( new Edge[] {e21});
        n12.setNeighbourEdges( new Edge[] {e22});
        n13.setNeighbourEdges( new Edge[] {e23});
        n14.setNeighbourEdges( new Edge[] {e24});
        n15.setNeighbourEdges( new Edge[] {e25});

        Node<Pair<Integer,Integer>> start =  n8;
        Node<Pair<Integer,Integer>> goal = n6;

        //calculate estimated cost from current to goal - euclidean distance
        for (Node<Pair<Integer,Integer>> node : nodes) {
            Pair<Integer,Integer> goalPair = (Pair<Integer,Integer>) goal.getData();
            Pair<Integer,Integer> nodePair = (Pair<Integer,Integer>) goal.getData();

            double h = Math.abs(goalPair.getValue() - nodePair.getValue());
            double l = Math.abs(goalPair.getKey() - nodePair.getKey());
            node.setH(Math.sqrt(h*h+l*l));
        }

        AStarSearch astar = new AStarSearch();
        ArrayList<Edge> path = astar.findPath(start,goal);

        for(Edge edge : path) {
            System.out.println(edges.get((int)edge.getId()-1).getData());
        }
    }
}