

import java.util.Objects;

public class Book {
        private String title = "<no title>";
        private String author = "<no author>";
        private Boolean hasAuthor;

	        public Book(String title, String author){
            this.title = Objects.requireNonNull(title, "titles can't be null");
            this.author = Objects.requireNonNull(author, "authors can't be null");
            hasAuthor = true;
	        }
			
			    public Book(String title){
            this.title = Objects.requireNonNull(title, "titles can't be null");

	        	this.title = title;
            hasAuthor = false;
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


        @Override public String toString(){
          return title + ( hasAuthor ? (", by " + author ):"");
        }
}