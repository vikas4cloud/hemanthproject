public static void main(String[] args) throws Exception {
    Stack stack = Contentstack.stack("btl23..........", "cs27..........", "env");
    ContentType contentType = stack.contentType("products");
    Query query = contentType.query();
    query.find(new QueryResultsCallBack() {
    @Override
    public void onCompletion(ResponseType responseType, 
                            QueryResult queryresult,Error error) {
        System.out.println(queryresult.getResultObjects());
     }
   });
 