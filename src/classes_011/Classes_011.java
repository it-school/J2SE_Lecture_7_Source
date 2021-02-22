// Пример с книжной библиотекой

package classes_011;

class Classes_011 {
    public static void main(String[] args) {
        System.out.println("\nПример с библиотекой");
        // 2 книжных шкафа, на каждом 2 полки, на каждой полке 2 ячейки для книг
        Book library[][][] = new Book[2][2][2];

        int counter = 1;
        for (int i = 0; i < library.length; i++) {
            for (int j = 0; j < library[i].length; j++) {
                for (int k = 0; k < library[i][j].length; k++) {
                    String AutorName = "Автор " + counter;
                    String BookName = "Название " + counter * 2;

                    library[i][j][k] = new Book(BookName, AutorName);
                    ++counter;
                }
            }
        }

        for (int i = 0; i < library.length; i++) {
            for (int j = 0; j < library[i].length; j++) {
                for (int k = 0; k < library[i][j].length; k++) {
                    System.out.println("Шкаф " + (i + 1) + "-ый " +
                            " Полка " + (j + 1) + "-ая " + "Ячейка " + (k + 1) + "-ая. Книга - " +
                            library[i][j][k].Name + " Автор " + library[i][j][k].AuthorName);
                }
            }
        }
    }
}
