package ru.pmo.test3.jira.webwork;

import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.plugin.spring.scanner.annotation.imports.JiraImport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.web.action.JiraWebActionSupport;
import com.atlassian.sal.api.pluginsettings.PluginSettingsFactory;

import javax.inject.Inject;

public class NewWebworkAction extends JiraWebActionSupport
{
    private static final Logger log = LoggerFactory.getLogger(NewWebworkAction.class);

    private static final String PLUGIN_STORAGE_KEY = "ru.pmo.test3.TestPmo3-tests";

    private String option;

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
    @ComponentImport
    private final PluginSettingsFactory pluginSettingsFactory;
    @Inject
    public NewWebworkAction(PluginSettingsFactory pluginSettingsFactory){

        this.pluginSettingsFactory = pluginSettingsFactory;
    }

    @Override
    public String execute() throws Exception {

        return super.execute(); //returns SUCCESS
    }
//    public String save(){
//
//    }
}
