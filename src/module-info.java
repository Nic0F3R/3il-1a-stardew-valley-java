module StardewValley {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires org.junit.jupiter.api;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
