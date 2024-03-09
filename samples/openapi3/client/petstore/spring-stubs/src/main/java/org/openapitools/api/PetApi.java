/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.4.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ModelApiResponse;
import org.openapitools.model.Pet;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0-SNAPSHOT")
@Validated
@Tag(name = "pet", description = "Everything about your Pets")
public interface PetApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /pet : Add a new pet to the store
     * 
     *
     * @param pet Pet object that needs to be added to the store (required)
     * @return successful operation (status code 200)
     *         or Invalid input (status code 405)
     */
    @Operation(
        operationId = "addPet",
        summary = "Add a new pet to the store",
        description = "",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Pet.class))
            }),
            @ApiResponse(responseCode = "405", description = "Invalid input")
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes={ "write:pets", "read:pets" })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pet",
        produces = "application/json,application/xml",
        consumes = "application/json"
    )
    
    default ResponseEntity<Pet> addPet(
        @Parameter(name = "Pet", description = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody Pet pet
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Pet> <id>123456789</id> <Category> <id>123456789</id> <name>aeiou</name> </Category> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <Tag> <id>123456789</id> <name>aeiou</name> </Tag> </tags> <status>aeiou</status> </Pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /pet/{petId} : Deletes a pet
     * 
     *
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @return Invalid pet value (status code 400)
     */
    @Operation(
        operationId = "deletePet",
        summary = "Deletes a pet",
        description = "",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid pet value")
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes={ "write:pets", "read:pets" })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/pet/{petId}"
    )
    
    default ResponseEntity<Void> deletePet(
        @Parameter(name = "petId", description = "Pet id to delete", required = true, in = ParameterIn.PATH) @PathVariable("petId") Long petId,
        @Parameter(name = "api_key", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "api_key", required = false) String apiKey
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /pet/findByStatus : Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     *
     * @param status Status values that need to be considered for filter (required)
     * @return successful operation (status code 200)
     *         or Invalid status value (status code 400)
     */
    @Operation(
        operationId = "findPetsByStatus",
        summary = "Finds Pets by status",
        description = "Multiple status values can be provided with comma separated strings",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = Pet.class))),
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Pet.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid status value")
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes={ "read:pets" })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pet/findByStatus",
        produces = "application/json,application/xml"
    )
    
    default ResponseEntity<List<Pet>> findPetsByStatus(
        @NotNull @Parameter(name = "status", deprecated = true, description = "Status values that need to be considered for filter", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "status", required = true) @Deprecated List<String> status
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }, { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Pet> <id>123456789</id> <Category> <id>123456789</id> <name>aeiou</name> </Category> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <Tag> <id>123456789</id> <name>aeiou</name> </Tag> </tags> <status>aeiou</status> </Pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /pet/findByTags : Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @param tags Tags to filter by (required)
     * @return successful operation (status code 200)
     *         or Invalid tag value (status code 400)
     * @deprecated
     */
    @Deprecated
    @Operation(
        operationId = "findPetsByTags",
        summary = "Finds Pets by tags",
        description = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.",
        deprecated = true,
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = Pet.class))),
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Pet.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid tag value")
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes={ "read:pets" })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pet/findByTags",
        produces = "application/json,application/xml"
    )
    
    default ResponseEntity<List<Pet>> findPetsByTags(
        @NotNull @Parameter(name = "tags", description = "Tags to filter by", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "tags", required = true) List<String> tags
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }, { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Pet> <id>123456789</id> <Category> <id>123456789</id> <name>aeiou</name> </Category> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <Tag> <id>123456789</id> <name>aeiou</name> </Tag> </tags> <status>aeiou</status> </Pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /pet/{petId} : Find pet by ID
     * Returns a single pet
     *
     * @param petId ID of pet to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     */
    @Operation(
        operationId = "getPetById",
        summary = "Find pet by ID",
        description = "Returns a single pet",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Pet.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Pet not found")
        },
        security = {
            @SecurityRequirement(name = "api_key")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pet/{petId}",
        produces = "application/json,application/xml"
    )
    
    default ResponseEntity<Pet> getPetById(
        @Parameter(name = "petId", description = "ID of pet to return", required = true, in = ParameterIn.PATH) @PathVariable("petId") Long petId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Pet> <id>123456789</id> <Category> <id>123456789</id> <name>aeiou</name> </Category> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <Tag> <id>123456789</id> <name>aeiou</name> </Tag> </tags> <status>aeiou</status> </Pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /pet : Update an existing pet
     * 
     *
     * @param pet Pet object that needs to be added to the store (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     *         or Validation exception (status code 405)
     * API documentation for the updatePet operation
     * @see <a href="http://petstore.swagger.io/v2/doc/updatePet">Update an existing pet Documentation</a>
     */
    @Operation(
        operationId = "updatePet",
        summary = "Update an existing pet",
        description = "",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Pet.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Pet not found"),
            @ApiResponse(responseCode = "405", description = "Validation exception")
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes={ "write:pets", "read:pets" })
        },
        externalDocs = @ExternalDocumentation(description = "API documentation for the updatePet operation", url = "http://petstore.swagger.io/v2/doc/updatePet")
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/pet",
        produces = "application/json,application/xml",
        consumes = "application/json"
    )
    
    default ResponseEntity<Pet> updatePet(
        @Parameter(name = "Pet", description = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody Pet pet
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 0, \"category\" : { \"name\" : \"name\", \"id\" : 6 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Pet> <id>123456789</id> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> </tags> <status>aeiou</status> </Pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /pet/{petId} : Updates a pet in the store with form data
     * 
     *
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @return Invalid input (status code 405)
     */
    @Operation(
        operationId = "updatePetWithForm",
        summary = "Updates a pet in the store with form data",
        description = "",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "405", description = "Invalid input")
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes={ "write:pets", "read:pets" })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pet/{petId}",
        consumes = "application/x-www-form-urlencoded"
    )
    
    default ResponseEntity<Void> updatePetWithForm(
        @Parameter(name = "petId", description = "ID of pet that needs to be updated", required = true, in = ParameterIn.PATH) @PathVariable("petId") Long petId,
        @Parameter(name = "name", description = "Updated name of the pet") @Valid @RequestParam(value = "name", required = false) String name,
        @Parameter(name = "status", description = "Updated status of the pet") @Valid @RequestParam(value = "status", required = false) String status
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /pet/{petId}/uploadImage : uploads an image
     * 
     *
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "uploadFile",
        summary = "uploads an image",
        description = "",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes={ "write:pets", "read:pets" })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pet/{petId}/uploadImage",
        produces = "application/json",
        consumes = "multipart/form-data"
    )
    
    default ResponseEntity<ModelApiResponse> uploadFile(
        @Parameter(name = "petId", description = "ID of pet to update", required = true, in = ParameterIn.PATH) @PathVariable("petId") Long petId,
        @Parameter(name = "additionalMetadata", description = "Additional data to pass to server") @Valid @RequestParam(value = "additionalMetadata", required = false) String additionalMetadata,
        @Parameter(name = "file", description = "file to upload") @RequestPart(value = "file", required = false) MultipartFile file
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"type\" : \"type\", \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
