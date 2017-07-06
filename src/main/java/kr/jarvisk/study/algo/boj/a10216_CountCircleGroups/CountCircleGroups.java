package kr.jarvisk.study.algo.boj.a10216_CountCircleGroups;

import java.util.*;

/**
 * Count Circle Groups
 *
 * https://www.acmicpc.net/problem/10216
 *
 * 1차 틀림 : 레이더망이 사각형인줄 알고 사각형 겹침으로 검사했는데, 질문 보니 원으로..(하긴,,, 제목이 Circle인데;;)
 */
public class CountCircleGroups {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        for ( int c = 0; c < testCase; c++ ) {
            int n = scanner.nextInt();
            Station[] stations = new Station[ n ];
            for ( int i = 0; i < n; i++ ) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int r = scanner.nextInt();
                stations[ i ] = new Station(i, x, y, r);
            }

            System.out.println(solve(stations));
        }
    }

    public static int solve(Station[] stations) {
        DisjointSet<Station> disjointSet = new DisjointSet<>(stations);

        for ( int i = 1; i < stations.length; i++ ) {
            for ( int j = 0; j < i; j++ ) {
                if ( stations[ j ].overlap(stations[ i ]) ) {
                    disjointSet.merge(stations[ i ], stations[ j ]);
                }
            }
        }

        Set<DisjointSet.Node> set = new HashSet<>();
        for ( Station station : stations ) {
            DisjointSet.Node node = disjointSet.find(station);
            set.add(node);
        }

        return set.size();
    }

    public static class Station {
        private final int name;
        private final int x;
        private final int y;
        private final int r;

        private Rect rect;

        public Station(int name, int x, int y, int r) {
            this.name = name;
            this.x = x;
            this.y = y;
            this.r = r;
            rect = new Rect(x - r, y - r, r * 2, r * 2);
        }

        public boolean overlap(Station s2) {
            Station s1 = this;
            return s1.rect.overlap(s2.rect);
        }

        @Override
        public boolean equals(Object o) {
            if ( this == o ) return true;
            if ( !(o instanceof Station) ) return false;
            Station station = (Station) o;
            return name == station.name &&
                    x == station.x &&
                    y == station.y &&
                    r == station.r;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, x, y, r);
        }
    }

    public static class Rect {
        int x;
        int y;
        int w;
        int h;

        public Rect(int x, int y, int w, int h) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
        }

        public boolean overlap(Rect rect) {
            Rect r1 = this;
            Rect r2 = rect;
            if ( r1.x > r2.x + r2.w ) return false;
            if ( r1.x + r1.w < r2.x ) return false;
            if ( r1.y > r2.y + r2.h ) return false;
            if ( r1.y + r1.h < r2.y ) return false;

            return true;
        }
    }

    public static class DisjointSet<T> {

        private Map<T, Node> nodeMap;

        public DisjointSet(T[] objs) {
            int capacity = (int) (objs.length + objs.length * 0.75f) + 1;
            nodeMap = new HashMap<>(capacity);
            for ( T obj : objs ) {
                Node<T> node = new Node<>(obj);
                nodeMap.put(obj, node);
            }
        }

        private Node getNode(T t) {
            return nodeMap.get(t);
        }

        public Node find(T t) {
            Node node = getNode(t);
            Node root = node;

            while ( root != root.parent ) {
                root = root.parent;
            }

            return root;
        }

        public Node merge(T t1, T t2) {
            Node node1 = find(t1);
            Node node2 = find(t2);

            node2.parent = node1;

            return node1;
        }

        public static class Node<T> {
            private T t;

            private Node<T> parent;

            public Node(T t) {
                this.t = t;
                this.parent = this;
            }
        }

    }

}
