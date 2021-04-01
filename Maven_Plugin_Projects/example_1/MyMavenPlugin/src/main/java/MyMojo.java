
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

//<goal>My_Maven_Plugin</goal>
@Mojo(name = "My_Maven_Plugin", defaultPhase = LifecyclePhase.INSTALL )
public class MyMojo extends AbstractMojo {

    @Parameter(property = "my.property", defaultValue = "missing")
    private String myProperty;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("I am inside 'My Maven Plugin' !!!");
        getLog().info("my.property: " + myProperty);
    }
}