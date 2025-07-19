import java.util.*;

public class HashMapCode {
    static class HashMap<K,V>{ // es class k objects bnayege. <K,V> called generics
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n; // no. of nodes
        private int N; // no. of buckets
        private LinkedList<Node> buckets[]; // buckets naam ka array bna liya. ye actually hashmap

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4; // N= no. of buckets
            // data ko store krne k liye phele khali ll ka hona zruri hai
            this.buckets= new LinkedList[4]; // buckets naam ka arr
            for(int i=0; i<4; i++){
                this.buckets[i]= new LinkedList<>();
            }
        }

        private int hasFunction(K key){ // 0 to N-1
            int bi= key.hashCode();
            // 23456  -23456 can give both -ve nd +ve values. But bucket index should be of +ve values only
            // -ve values ko positive bnane k liye
            return Math.abs(bi) % N;

        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll=buckets[bi];
        }
        public void put(K key, V value){
            // sbse phele bucket index nikal lo tbhi pta chlega vo value phele se exist krti hai ya nahi
            int bi= hashFunction(key);  // bucket index
            int di= searchInLL(key, bi); // data index de dega- linked list ka index
            // agr dataindex ki value= valid(0+) mtlb key phele se exist krti hai
            // dataindex = -1, key exist nhi krti

            if(di==-1){ // key doesnt exist
                buckets[bi].add(new Node(key,value)); // naye node ko add krdia ll k andar
                n++;
            }else{ // key exist
                Node data= buckets[bi].get(di);
                data.value= value;
            }

            doube lambda= (double)n/N;
            if(lambda>2.0){
                //rehashing
            }
        }
        
    } 
}
