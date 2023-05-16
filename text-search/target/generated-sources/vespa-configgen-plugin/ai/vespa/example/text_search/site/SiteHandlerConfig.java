/**
 * This file is generated from a config definition file.
 * ------------   D O   N O T   E D I T !   ------------
 */

package ai.vespa.example.text_search.site;

import java.util.*;
import java.io.File;
import java.nio.file.Path;
import com.yahoo.config.*;

/**
 * This class represents the root node of site-handler
 *
 */
public final class SiteHandlerConfig extends ConfigInstance {

  public final static String CONFIG_DEF_MD5 = "a7eb321b6d64da05ceaf3d434c2ea5a3";
  public final static String CONFIG_DEF_NAME = "site-handler";
  public final static String CONFIG_DEF_NAMESPACE = "ai.vespa.example.text_search.site";
  public final static String[] CONFIG_DEF_SCHEMA = {
    "package=ai.vespa.example.text_search.site",
    "vespaHostName string",
    "vespaHostPort int"
  };

  public static String getDefMd5()       { return CONFIG_DEF_MD5; }
  public static String getDefName()      { return CONFIG_DEF_NAME; }
  public static String getDefNamespace() { return CONFIG_DEF_NAMESPACE; }

  public interface Producer extends ConfigInstance.Producer {
    void getConfig(Builder builder);
  }

  public static class Builder implements ConfigInstance.Builder {
    private Set<String> __uninitialized = new HashSet<String>(Arrays.asList(
      "vespaHostName",
      "vespaHostPort"
      ));

    private String vespaHostName = null;
    private Integer vespaHostPort = null;

    public Builder() { }

    public Builder(SiteHandlerConfig config) {
      vespaHostName(config.vespaHostName());
      vespaHostPort(config.vespaHostPort());
    }

    private Builder override(Builder __superior) {
      if (__superior.vespaHostName != null)
        vespaHostName(__superior.vespaHostName);
      if (__superior.vespaHostPort != null)
        vespaHostPort(__superior.vespaHostPort);
      return this;
    }

    public Builder vespaHostName(String __value) {
    if (__value == null) throw new IllegalArgumentException("Null value is not allowed.");
      vespaHostName = __value;
      __uninitialized.remove("vespaHostName");
      return this;
    }


    public Builder vespaHostPort(int __value) {
      vespaHostPort = __value;
      __uninitialized.remove("vespaHostPort");
      return this;
    }

    private Builder vespaHostPort(String __value) {
      return vespaHostPort(Integer.valueOf(__value));
    }

    private boolean _applyOnRestart = false;

    @java.lang.Override
    public final boolean dispatchGetConfig(ConfigInstance.Producer producer) {
      if (producer instanceof Producer) {
        ((Producer)producer).getConfig(this);
        return true;
      }
      return false;
    }

    @java.lang.Override
    public final String getDefMd5() { return CONFIG_DEF_MD5; }

    @java.lang.Override
    public final String getDefName() { return CONFIG_DEF_NAME; }

    @java.lang.Override
    public final String getDefNamespace() { return CONFIG_DEF_NAMESPACE; }

    @java.lang.Override
    public final boolean getApplyOnRestart() { return _applyOnRestart; }

    @java.lang.Override
    public final void setApplyOnRestart(boolean applyOnRestart) { _applyOnRestart = applyOnRestart; }

    public SiteHandlerConfig build() {
      return new SiteHandlerConfig(this);
    }

  }

  private final StringNode vespaHostName;
  private final IntegerNode vespaHostPort;

  public SiteHandlerConfig(Builder builder) {
    this(builder, true);
  }

  private SiteHandlerConfig(Builder builder, boolean throwIfUninitialized) {
    if (throwIfUninitialized && ! builder.__uninitialized.isEmpty())
      throw new IllegalArgumentException("The following builder parameters for " +
          "site-handler must be initialized: " + builder.__uninitialized);

    vespaHostName = (builder.vespaHostName == null) ?
        new StringNode() : new StringNode(builder.vespaHostName);
    vespaHostPort = (builder.vespaHostPort == null) ?
        new IntegerNode() : new IntegerNode(builder.vespaHostPort);
  }

  /**
   * @return site-handler.vespaHostName
   */
  public String vespaHostName() {
    return vespaHostName.value();
  }

  /**
   * @return site-handler.vespaHostPort
   */
  public int vespaHostPort() {
    return vespaHostPort.value();
  }

  private ChangesRequiringRestart getChangesRequiringRestart(SiteHandlerConfig newConfig) {
    ChangesRequiringRestart changes = new ChangesRequiringRestart("site-handler");
    return changes;
  }

  private static boolean containsFieldsFlaggedWithRestart() {
    return false;
  }


}
