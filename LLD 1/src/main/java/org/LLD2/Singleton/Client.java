package org.LLD2.Singleton;

public class Client {
    public static void main(String[] args) {
         DBConn dbConn = DBConn.getInstanceSynchronizedBlock();
         DBConn dbConn1 = DBConn.getInstanceSynchronizedBlock();
         System.out.println("Only one instance will be created =>");
         System.out.println(dbConn == dbConn1);
    }
}
