package org.azd.interfaces;

import org.azd.enums.WorkItemErrorPolicy;
import org.azd.enums.WorkItemExpand;
import org.azd.enums.WorkItemOperation;
import org.azd.exceptions.AzDException;
import org.azd.exceptions.DefaultParametersException;
import org.azd.workitemtracking.types.*;

public interface WorkItemDetails {
    WorkItem createWorkItem(String workItemType, WorkItemOperation operation, String title) throws DefaultParametersException, AzDException;
    WorkItem createWorkItem(String workItemType,
                            WorkItemOperation operation, String title, String description,
                            String[] tags) throws DefaultParametersException, AzDException;
    WorkItemDelete deleteWorkItem(int id) throws DefaultParametersException, AzDException;
    WorkItemDelete deleteWorkItem(int id, boolean destroy) throws DefaultParametersException, AzDException;
    WorkItem getWorkItem(int id) throws DefaultParametersException, AzDException;
    WorkItem getWorkItem(int id, WorkItemExpand expand) throws DefaultParametersException, AzDException;
    WorkItem getWorkItem(int id, WorkItemExpand expand, String asOf) throws DefaultParametersException, AzDException;
    WorkItem getWorkItem(int id, WorkItemExpand expand, String[] fields) throws DefaultParametersException, AzDException;
    WorkItem getWorkItem(int id, WorkItemExpand expand, String[] fields, String asOf) throws DefaultParametersException, AzDException;
    WorkItemList getWorkItems(int[] ids) throws DefaultParametersException, AzDException;
    WorkItemList getWorkItems(int[] ids, WorkItemExpand expand) throws DefaultParametersException, AzDException;
    WorkItemList getWorkItems(int[] ids, WorkItemExpand expand, String asOf) throws DefaultParametersException, AzDException;
    WorkItemList getWorkItems(int[] ids, WorkItemExpand expand, String[] fields) throws DefaultParametersException, AzDException;
    WorkItemList getWorkItems(int[] ids, WorkItemExpand expand, String[] fields,
                              String asOf, WorkItemErrorPolicy errorPolicy) throws DefaultParametersException, AzDException;
    WorkItemList getWorkItemRevisions(int workItemId) throws DefaultParametersException, AzDException;
    WorkItemList getWorkItemRevisions(int workItemId, WorkItemExpand expand) throws DefaultParametersException, AzDException;
    WorkItemList getWorkItemRevisions(int workItemId, WorkItemExpand expand, int top, int skip) throws DefaultParametersException, AzDException;
    WorkItem getWorkItemRevision(int workItemId, int revisionNumber) throws DefaultParametersException, AzDException;
    WorkItem getWorkItemRevision(int workItemId, int revisionNumber, WorkItemExpand expand) throws DefaultParametersException, AzDException;
    WorkItemQueryResult queryByWiql(String team, String query) throws DefaultParametersException, AzDException;
    WorkItemQueryResult queryByWiql(String team, String query, int top, boolean timePrecision) throws DefaultParametersException, AzDException;
    void removeWorkItemFromRecycleBin(int id) throws DefaultParametersException, AzDException;
    WorkItemDeleteReference getWorkItemFromRecycleBin(int id) throws DefaultParametersException, AzDException;
    WorkItemDeleteShallowReferences getDeletedWorkItemsFromRecycleBin() throws DefaultParametersException, AzDException;
    WorkItemDeleteReferences getDeletedWorkItemsFromRecycleBin(int[] ids) throws DefaultParametersException, AzDException;
    WorkItemDeleteReference restoreWorkItemFromRecycleBin(int id) throws DefaultParametersException, AzDException;
}
