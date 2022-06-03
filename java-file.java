package com.sirionlabs.event.invoice.controller;

import com.sirionlabs.event.invoice.finance.EntityFinancialData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import com.sirionlabs.model.Relation;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.Parameter;
//import io.swagger.v3.oas.annotations.media.Content;
//import io.swagger.v3.oas.annotations.media.Schema;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import io.swagger.v3.oas.annotations.responses.ApiResponses;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/testSwaggerForSirion")
@Api(value = "Apis for performing POC on Swagger Docs Portal", tags = {"Sirion Apis"}
    , description = "Apis for performing POC on Swagger Docs Portal")
//@Tag(name = "Swagger V3 POC", description = "Apis for performing POC on Swagger Docs Portal")
public class SwaggerPOCController {

//  @Operation(summary = "Update a Resource entity on Sirion backend")
  @ApiOperation(value = "Update a Resource entity on Sirion backend")
//  @io.swagger.v3.oas.annotations.parameters.RequestBody()
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Financial data entity details of the requested entity"),
      @ApiResponse(code = 401, message = "User not authorized" /* content = @Content(schema = @Schema(implementation = Relation.class))*/),
      @ApiResponse(code = 404, message = "Path not found") })
  @PostMapping(value = "/{entityId}/{entityTypeId}")
  public List<EntityFinancialData> getByIdAndTypeId (@ApiParam(example = "123456", value = "id of the entity", required = true) @PathVariable(value="entityId") final Integer entityId,
      @ApiParam(example = "61", value = "type id of the entity", required = true) @PathVariable(value = "entityTypeId") final Integer entityTypeId,
      @ApiParam(value = "Limit and offset of the list to return the response in batches) ", required = true) @RequestBody EntityFinancialDataJsonRequest jsonRequest) {
    return new ArrayList<>();//HttpServletRequest, RequestResponseStruct
  }

}
