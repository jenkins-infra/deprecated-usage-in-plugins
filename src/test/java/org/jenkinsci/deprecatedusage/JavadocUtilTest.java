package org.jenkinsci.deprecatedusage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class JavadocUtilTest {

    @Parameters(name = "testLinking({0})")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {
                "hudson/util/RunList#size()I",
                "http://javadoc.jenkins.io/hudson/util/RunList.html#size--"
            },
            {
                "hudson/util/ChartUtil#generateGraph(Lorg/kohsuke/stapler/StaplerRequest;Lorg/kohsuke/stapler/StaplerResponse;Lorg/jfree/chart/JFreeChart;II)V",
                "http://javadoc.jenkins.io/hudson/util/ChartUtil.html#generateGraph-org.kohsuke.stapler.StaplerRequest-org.kohsuke.stapler.StaplerResponse-org.jfree.chart.JFreeChart-int-int-"
            },
            {
                "hudson/util/IOUtils#write([BLjava/io/OutputStream;)V",
                "http://javadoc.jenkins.io/hudson/util/IOUtils.html#write-byte:A-java.io.OutputStream-"
            },
            {
                "hudson/Launcher#launch([Ljava/lang/String;[Ljava/lang/String;Ljava/io/InputStream;Ljava/io/OutputStream;Lhudson/FilePath;)Lhudson/Proc;",
                "http://javadoc.jenkins.io/hudson/Launcher.html#launch-java.lang.String:A-java.lang.String:A-java.io.InputStream-java.io.OutputStream-hudson.FilePath-"
            },
            {
                "hudson/Launcher#launch(Ljava/lang/String;Ljava/util/Map;Ljava/io/OutputStream;Lhudson/FilePath;)Lhudson/Proc;",
                "http://javadoc.jenkins.io/hudson/Launcher.html#launch-java.lang.String-java.util.Map-java.io.OutputStream-hudson.FilePath-"
            },
            {
                "hudson/tools/ToolInstallation#<init>(Ljava/lang/String;Ljava/lang/String;)V",
                "http://javadoc.jenkins.io/hudson/tools/ToolInstallation.html#ToolInstallation-java.lang.String-java.lang.String-"
            },
            {
                "hudson/util/ChartUtil$NumberOnlyBuildLabel#<init>(Lhudson/model/AbstractBuild;)V",
                "http://javadoc.jenkins.io/hudson/util/ChartUtil.NumberOnlyBuildLabel.html#NumberOnlyBuildLabel-hudson.model.AbstractBuild-"
            },
            {
                "hudson/slaves/DumbSlave#<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhudson/model/Node$Mode;Ljava/lang/String;Lhudson/slaves/ComputerLauncher;Lhudson/slaves/RetentionStrategy;Ljava/util/List;)V",
                "http://javadoc.jenkins.io/hudson/slaves/DumbSlave.html#DumbSlave-java.lang.String-java.lang.String-java.lang.String-java.lang.String-hudson.model.Node.Mode-java.lang.String-hudson.slaves.ComputerLauncher-hudson.slaves.RetentionStrategy-java.util.List-"
            },
            {
                "hudson/model/Build$RunnerImpl",
                "http://javadoc.jenkins.io/hudson/model/Build.RunnerImpl.html"
            },
            {
                "hudson/util/ChartUtil$NumberOnlyBuildLabel#build",
                "http://javadoc.jenkins.io/hudson/util/ChartUtil.NumberOnlyBuildLabel.html#build"
            },
            {
                "hudson/node_monitors/AbstractNodeMonitorDescriptor#<init>(J)V",
                "http://javadoc.jenkins.io/hudson/node_monitors/AbstractNodeMonitorDescriptor.html#AbstractNodeMonitorDescriptor-long-"
            },
            {
                "hudson/model/MultiStageTimeSeries#<init>(FF)V",
                "http://javadoc.jenkins.io/hudson/model/MultiStageTimeSeries.html#MultiStageTimeSeries-float-float-"
            },
            {
                // FAKED ONE, no public method in jenkins with a double found
                "hudson/node_monitors/AbstractNodeMonitorDescriptor#<init>(D)V",
                "http://javadoc.jenkins.io/hudson/node_monitors/AbstractNodeMonitorDescriptor.html#AbstractNodeMonitorDescriptor-double-"
            },
            {
                // FAKED ONE, no public method in jenkins with a short found
                "hudson/node_monitors/AbstractNodeMonitorDescriptor#<init>(S)V",
                "http://javadoc.jenkins.io/hudson/node_monitors/AbstractNodeMonitorDescriptor.html#AbstractNodeMonitorDescriptor-short-"
            }
        });
    }

    @Parameter()
    public String signature;

    @Parameter(1)
    public String expectedLink;

    @Test
    public void testLinking() {
        assertEquals(expectedLink, JavadocUtil.CORE.signatureToJenkinsdocUrl(signature));
    }
}
