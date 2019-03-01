
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

          
          //redefinit la fonction testant l'égalité de deux livres afin de comparer leurs champs
          @Override public boolean equals(Object obj) {
          if (this == obj){
            return true;
          }

          if (obj==null){
            return false;
          }
   
          if (getClass() != obj.getClass()) {
              return false;
          }
          
          Book other = (Book) obj;
          return (this.title.equals(other.title) && this.author.equals(other.author));
        }
}