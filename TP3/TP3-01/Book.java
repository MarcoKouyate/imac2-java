
public class Book {
        private String title = "<no title>";
        private String author = "<no author>";

	        public Book(String title, String author){
	        	this.title = title;
	        	this.author = author;
	        }
			
			public Book(String title){
	        	this.title = title;
	        }
			

        	public String getTitle()
      		{
        		return title;
      		} 

      		public String getAuthor()
      		{
        		return author;
      		}  
}