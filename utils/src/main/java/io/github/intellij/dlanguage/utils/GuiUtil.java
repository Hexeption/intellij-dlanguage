package io.github.intellij.dlanguage.utils;

/**
 * Various helpers for creating GUI elements.
 */
public class GuiUtil {
//
//    /**
//     * Creates a label and path selector and adds them to the configuration
//     * window.
//     *
//     * @param settings Panel to add components to.
//     * @param tool     Which tool to configure.
//     * @return The TextFieldWithBrowseButton created.
//     */
//    public static TextFieldWithBrowseButton createExecutableOption(final JPanel settings, final String tool, final Object constraints) {
//        // Create UI elements.
//        final TextFieldWithBrowseButton tf = new TextFieldWithBrowseButton();
//        tf.addBrowseFolderListener("Select " + tool + " path", "", null,
//            FileChooserDescriptorFactory.createSingleLocalFileDescriptor());
//
//        // Add elements to Panel.
//        final JPanel subPanel = new JPanel(new GridBagLayout());
//        subPanel.add(new JLabel(tool + " executable path:"));
////        subPanel.add(tf, getFillLineConstraints());
//        settings.add(subPanel, constraints);
//
//        return tf;
//    }
//
//    public static TextFieldWithBrowseButton createExecutableOption(final JPanel settings, final String tool) {
//        return createExecutableOption(settings, tool);
//    }
//
//    /**
//     * Creates a label and text field input and adds them to the configuration
//     * window.
//     *
//     * @param settings  Panel to add components to.
//     * @param labelText Which text to show to the left of the field.
//     * @return The TextFieldWithBrowseButton created.
//     */
//    public static TextFieldWithHistory createTextfield(final JPanel settings, final String labelText, final Object constraints) {
//        // Create UI elements.
//        final TextFieldWithHistory tf = new TextFieldWithHistory();
//
//        // Add elements to Panel.
//        final JPanel subPanel = new JPanel(new GridBagLayout());
//        subPanel.add(new JLabel(labelText + ':'));
////        subPanel.add(tf, getFillLineConstraints());
//        settings.add(subPanel, constraints);
//
//        return tf;
//    }
//
//    public static TextFieldWithHistory createTextfield(final JPanel settings, final String labelText) {
//        return createTextfield(settings, labelText);
//    }
//
//    /**
//     * Creates two labels adds them to the configuration window.
//     *
//     * @param settings Panel to add components to.
//     * @param tool     Which tool to display version for.
//     * @return The label with dynamic content.
//     */
//    public static JLabel createDisplayVersion(final JPanel settings, final String tool, final Object constraints) {
//        final JLabel tf = new JLabel("");
//
//        // Add elements to Panel.
//        final JPanel subPanel = new JPanel(new GridBagLayout());
//        subPanel.add(new JLabel(tool + " version:"));
////        subPanel.add(tf, getFillLineConstraints());
//        settings.add(subPanel, constraints);
//
//        return tf;
//    }
//
//    public static JLabel createDisplayVersion(final JPanel settings, final String tool) {
//        return createDisplayVersion(settings, tool);
//    }
//
//    /**
//     * Create a check box and add to the configuration window.
//     *
//     * @param settings Panel to add checkbox to.
//     * @param text     Checkbox text.
//     * @return The checkbox.
//     */
//    public static JCheckBox createCheckBoxOption(final JPanel settings, final String text, final Object constraints) {
//        final JCheckBox tf = new JCheckBox(text);
//        settings.add(tf, constraints);
//
//        return tf;
//    }
//
//    public static JCheckBox createCheckBoxOption(final JPanel settings, final String text) {
//        return createCheckBoxOption(settings, text);
//    }
//
////    @NotNull
////    private static GridBag getFillLineConstraints() {
////        final int INSETS = 5;
////        return new GridBag().weightx(1)
////            .coverLine()
////            .fillCellHorizontally()
////            .anchor(GridBagConstraints.WEST)
////            .insets(JBUI.insets(INSETS, INSETS + INSETS, 0, INSETS));
////    }

}
