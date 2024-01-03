module qau.ces {
    
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires transitive javafx.base;
    requires transitive javafx.graphics;
    

    opens qau.ces to javafx.fxml;
    opens qau.ces.business to javafx.fxml;
    
    
    exports qau.ces;
}
