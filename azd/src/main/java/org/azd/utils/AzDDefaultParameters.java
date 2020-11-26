package org.azd.utils;

import java.util.Map;

/**
 * This sets the default parameters to use this library
 * <p>
 *     To call the Azure DevOps services REST API organization name and personal access token are
 *     mandatory. Setting these parameters as default helps to work with this library on ease.
 * </p>
 * @author Harish Karthic
 */
public class AzDDefaultParameters {
    private String Organization;
    private String Project;
    private String PersonalAccessToken;
    private final ProcessBuilder p = new ProcessBuilder();
    private final Map<String, String> env = p.environment();

    /***
     * default with no parameters
     */
    public AzDDefaultParameters() {
    }

    /**
     * Instantiates the class with organization name and personal access token
     * @param organization pass the organization name
     * @param personalAccessToken pass the personal access token
     */
    public AzDDefaultParameters(String organization, String personalAccessToken) {
        this.Organization = organization;
        this.PersonalAccessToken = personalAccessToken;
        setDefaultParameters(organization, null, personalAccessToken);
    }

    /**
     * Instantiates the class with organization name, project name and personal access token
     * @param organization pass the organization name
     * @param project provide the project name
     * @param personalAccessToken pass the personal access token
     */
    public AzDDefaultParameters(String organization, String project, String personalAccessToken) {
        this.Organization = organization;
        this.Project = project;
        this.PersonalAccessToken = personalAccessToken;
        setDefaultParameters(organization, project, personalAccessToken);
    }

    /**
     * Get the default organization name
     * @return organization name
     * */
    public String getOrganization() { return this.Organization; }

    /**
     * Set the organization name to default
     * @param organization pass the organization name
     * */
    public void setOrganization(String organization) { this.Organization = organization; }

    /**
     * Get the default Project name
     * @return project name
     * */
    public String getProject() { return this.Project; }

    /**
     * Set the project name to default
     * @param project pass the project name
     * */
    public void setProject(String project) { this.Project = project; }

    /**
     * Get the personal access token
     * @return the personal access token
     * */
    public String getPersonalAccessToken() { return this.PersonalAccessToken; }

    /**
     * Set the personal access token
     * @param personalAccessToken pass the personal access token
     * */
    public void setPersonalAccessToken(String personalAccessToken) { this.PersonalAccessToken = personalAccessToken; }

    /**
     * This sets the passed default parameters as environment variables in the process level
     * @param organization pass the organization name
     * @param personalAccessToken this is the personal access token which will be used to call REST API
     * @param project pass the project name
     * */
    private void setDefaultParameters(String organization, String project, String personalAccessToken) {
        env.put("AZD_ORG", organization);
        env.put("AZD_TOKEN", personalAccessToken);

        if (project != null) {
            env.put("AZD_PROJECT", project);
        }
    }
}