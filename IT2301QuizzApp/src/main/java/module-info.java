module com.ngocdo.it2301quizzapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    //requires lombok;
    opens com.ngocdo.it2301quizzapp to javafx.fxml;

    exports com.ngocdo.it2301quizzapp;
}
