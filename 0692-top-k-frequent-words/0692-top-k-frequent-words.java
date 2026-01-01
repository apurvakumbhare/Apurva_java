class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        ArrayList<Club> Clubs = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) { 
            Clubs.add(new Club(entry.getValue(), entry.getKey())); 
        }
        PriorityQueue<Club> queue=new PriorityQueue<>((x,y)->
        {if (x.getFrequency() == y.getFrequency()) {
            return y.getWord().compareTo(x.getWord());
        }
        return x.getFrequency()- y.getFrequency();});
        
        for(Club Club:Clubs){
           queue.add(Club);
           if(queue.size()>k){
               queue.poll();
           }
        }
        List<String> list=new ArrayList<>();
        while(!queue.isEmpty()){
            list.add(0,queue.poll().getWord());
        }
        return list;
    }
    class Club{
        int frequency;
        String Word;

        public int getFrequency() {
            return frequency;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        public Club(int frequency, String word) {
            this.frequency = frequency;
            this.Word = word;
        }

        public String getWord() {
            return Word;
        }

        public void setWord(String word) {
            Word = word;
        }
    }
   
}