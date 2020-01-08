module java.internal.util.module {
    exports java9.util to java.ui.module;

    opens java9.util to java.internal.module;

    requires java.internal.module;
}