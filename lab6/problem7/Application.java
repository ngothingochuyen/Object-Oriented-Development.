package lab6.problem7;

public class Application {
	public static void main(String[] args) {
		PluginSystem system = new PluginSystem();

        IPlugin printPlugin = new PrintPlugin();
        IPlugin savePlugin = new SavePlugin();

        system.runPlugin(printPlugin);
        system.runPlugin(savePlugin);
	}
}
