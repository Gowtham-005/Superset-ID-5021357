public class DocumentFactoryTest {
    public static void main(String[] args) {
        DocumentFactory factory = new WordDocumentFactory();
        Document document = factory.createDocument();
        document.create();
        
        factory = new PdfDocumentFactory();
        document = factory.createDocument();
        document.create();
        
        factory = new ExcelDocumentFactory();
        document = factory.createDocument();
        document.create();
    }
}
