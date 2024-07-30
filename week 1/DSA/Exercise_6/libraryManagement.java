public class LibraryManagement {
    private static Book[] books;

    public static void main(String[] args) {
        books = new Book[]{
            new Book("001", "Book One", "Author A"),
            new Book("002", "Book Two", "Author B"),
            new Book("003", "Book Three", "Author C")
        };

        System.out.println(linearSearch("Book Two"));
        System.out.println(binarySearch("Book One"));
    }

    public static Book linearSearch(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearch(String title) {
        int left = 0;
        int right = books.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = title.compareTo(books[mid].getTitle());
            if (result == 0)
                return books[mid];
            if (result > 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }
}
