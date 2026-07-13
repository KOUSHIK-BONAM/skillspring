// Implementing Factory Method Pattern 
//Creat object w

interface Document {
    void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word Document");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document");
    }
}

class DocumentFactory {
    public static Document createDocument(String type) {
        if (type.equalsIgnoreCase("WORD")) {
            return new WordDocument();
        } else if (type.equalsIgnoreCase("PDF")) {
            return new PdfDocument();
        } else if (type.equalsIgnoreCase("EXCEL")) {
            return new ExcelDocument();
        }
        return null;
    }
}

public class Factory_method_pattern {
    public static void main(String[] args) {
        Document doc1 = DocumentFactory.createDocument("WORD");
        Document doc2 = DocumentFactory.createDocument("PDF");
        Document doc3 = DocumentFactory.createDocument("EXCEL");

        doc1.open();
        doc2.open();
        doc3.open();
    }
}