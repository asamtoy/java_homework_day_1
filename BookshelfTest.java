import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BookshelfTest{
  Bookshelf bookshelf;
  Book book;

  @Before
  public void before() {
    bookshelf = new Bookshelf("Biographies");
    book = new Book();
  }

  @Test
  public void hasSubject(){
    assertEquals("Biographies", bookshelf.getSubject());
  }

  @Test
  public void bookshelfStartsEmpty(){
    assertEquals(0, bookshelf.bookCount());
  }

  @Test
  public void canStoreBook(){
    bookshelf.store(book);
    assertEquals(1, bookshelf.bookCount());
  }

  @Test
  public void cannotStoreBookWhenBookshelfFull(){
    for(int i=0; i<20; i++){
      bookshelf.store(book);
    }
    assertEquals(20, bookshelf.bookCount());
  }
  @Test
  public void bookshelfIsFull(){
    for(int i=0; i<20; i++){
      bookshelf.store(book);
    }
    assertEquals( true, bookshelf.isBookshelfFull());
  }
  @Test
  public void shouldEmptyShelfAfterReading(){
    bookshelf.store(book);
    bookshelf.empty();
    assertEquals(0, bookshelf.bookCount());
  }
}
