module java.ui.module {
    exports java9.ui;

    requires java.base; //added by default, no need to use explicitly
    requires java.desktop; //no import for Swing is available without it
    requires java.internal.module;
}