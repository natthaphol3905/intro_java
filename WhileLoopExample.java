class WhileLoopExample {
    public static void main(String args[]){
         int i=10;
         while(true){
              System.out.println(i);
              i--;

              if (i == -100) {
                  System.out.println("Stop");
                  break;
              }
         }
    }
}