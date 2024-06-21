package org.kubilaycicek.textBlocks;

public class TextBlocks {
    //Json

    public static void jsonBlock() {
        String text = """
                 {
                      "name": "Kubilay",
                      "surname":"Çiçek",
                      "age": 31
                 }
                """;

        System.out.printf(text);
    }

    public static void sqlStatement() {
        String sql = """
                SELECT id,name,surname \
                FROM Users
                WHERE department = "FINANCE" \
                ORDER BY id DESC
                """;
        System.out.println(sql);
    }
}
