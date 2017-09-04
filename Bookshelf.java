public class Bookshelf{
  private String subject;
  private Book[] list;

  public Bookshelf(String subject){
    this.subject = subject;
    this.list = new Book[20];
  }

  public String getSubject(){
    return this.subject;
  }

  public int bookCount(){
    int count = 0;
    for (Book book : this.list){
      if (book != null) {
        count++;
      }
    }
    return count;
  }

  public void store(Book book){
    if(this.isShelfFull()) {
      return;
    }
    int bookcount = bookCount();
    list[bookcount] = book;
  }
  public boolean isShelfFull(){
    return this.bookCount() == this.list.length;
  }

}
