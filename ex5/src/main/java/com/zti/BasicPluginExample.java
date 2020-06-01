package com.zti;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "basic-plugin", defaultPhase = LifecyclePhase.TEST)
public class BasicPluginExample extends AbstractMojo {
    @Parameter(property = "name")
    String prop;

    public void execute() throws MojoExecutionException, MojoFailureException
    {
        getLog().info("Moj plugin dziala: " + prop + "!");
    }
}
