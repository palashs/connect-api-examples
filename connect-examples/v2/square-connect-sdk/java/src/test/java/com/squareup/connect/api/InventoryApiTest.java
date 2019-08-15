/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.models.BatchChangeInventoryRequest;
import com.squareup.connect.models.BatchChangeInventoryResponse;
import com.squareup.connect.models.BatchRetrieveInventoryChangesRequest;
import com.squareup.connect.models.BatchRetrieveInventoryChangesResponse;
import com.squareup.connect.models.BatchRetrieveInventoryCountsRequest;
import com.squareup.connect.models.BatchRetrieveInventoryCountsResponse;
import com.squareup.connect.models.RetrieveInventoryAdjustmentResponse;
import com.squareup.connect.models.RetrieveInventoryChangesResponse;
import com.squareup.connect.models.RetrieveInventoryCountResponse;
import com.squareup.connect.models.RetrieveInventoryPhysicalCountResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InventoryApi
 */
@Ignore
public class InventoryApiTest {

    private final InventoryApi api = new InventoryApi();


    /**
     * BatchChangeInventory
     *
     * Applies new adjustments and counts to inventory. The response will contain the current calculated counts for all objects referenced in the request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void batchChangeInventoryTest() throws ApiException {
        BatchChangeInventoryRequest body = null;
        BatchChangeInventoryResponse response = api.batchChangeInventory(body);

        // TODO: test validations
    }

    /**
     * BatchRetrieveInventoryChanges
     *
     * Retrieves historical physical counts and adjustments. The set of physical counts and adjustments to return may be limited along several dimensions. The results appear in ascending order of server timestamp (oldest first), and are paginated. This endpoint is intended as a catch-all for queries that cannot be handled by the previous simpler endpoints.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void batchRetrieveInventoryChangesTest() throws ApiException {
        BatchRetrieveInventoryChangesRequest body = null;
        BatchRetrieveInventoryChangesResponse response = api.batchRetrieveInventoryChanges(body);

        // TODO: test validations
    }

    /**
     * BatchRetrieveInventoryCounts
     *
     * Retrieves current counts for a set of [CatalogObject](#type-catalogobject)s at a set of [Location](#type-location)s. If &#x60;updated_at&#x60; is specified, only counts that have changed since that time (based on the server timestamp for the most recent change) are returned. This allows clients to perform a \&quot;sync\&quot; operation, for example in response to receiving a Webhook. The results are sorted by [CatalogObject](#type-catalogobject) id and are paginated.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void batchRetrieveInventoryCountsTest() throws ApiException {
        BatchRetrieveInventoryCountsRequest body = null;
        BatchRetrieveInventoryCountsResponse response = api.batchRetrieveInventoryCounts(body);

        // TODO: test validations
    }

    /**
     * RetrieveInventoryAdjustment
     *
     * Retrieves the [InventoryAdjustment](#type-inventoryadjustment) with the given &#x60;adjustment_id&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveInventoryAdjustmentTest() throws ApiException {
        String adjustmentId = null;
        RetrieveInventoryAdjustmentResponse response = api.retrieveInventoryAdjustment(adjustmentId);

        // TODO: test validations
    }

    /**
     * RetrieveInventoryChanges
     *
     * Retrieves the set of inventory physical counts and adjustments for a given [CatalogObject](#type-catalogobject) at a given set of [Location](#type-location)s. The results appear in descending order of &#x60;occurred_at&#x60;/&#x60;counted_at&#x60; timestamp (newest first), and are paginated. There is no limits on how far back the caller can page. This endpoint is useful when displaying recent changes for a specific item. For more sophisticated queries, use a batch endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveInventoryChangesTest() throws ApiException {
        String catalogObjectId = null;
        String locationIds = null;
        String cursor = null;
        RetrieveInventoryChangesResponse response = api.retrieveInventoryChanges(catalogObjectId, locationIds, cursor);

        // TODO: test validations
    }

    /**
     * RetrieveInventoryCount
     *
     * Retrieves the current (calculated) stock count for a given [CatalogObject](#type-catalogobject) at a given set of [Location](#type-location)s. The response may be paginated when the number of locations is large. The sort order of current counts in the response is unspecified. For more sophisticated queries, use a batch endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveInventoryCountTest() throws ApiException {
        String catalogObjectId = null;
        String locationIds = null;
        String cursor = null;
        RetrieveInventoryCountResponse response = api.retrieveInventoryCount(catalogObjectId, locationIds, cursor);

        // TODO: test validations
    }

    /**
     * RetrieveInventoryPhysicalCount
     *
     * Retrieves the [InventoryPhysicalCount](#type-inventoryphysicalcount) with the given &#x60;physical_count_id&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveInventoryPhysicalCountTest() throws ApiException {
        String physicalCountId = null;
        RetrieveInventoryPhysicalCountResponse response = api.retrieveInventoryPhysicalCount(physicalCountId);

        // TODO: test validations
    }

}