package contracts.carsbyid

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    name("Should return single car" )
    description()

    request {

        method GET()

        url("/api/v1/car/b55dc50f-600f-4cbc-9b49-fed186cf6eb2" ) {

            headers {
                header( authorization(), $( c('Bearer dGVzdA==' ), p( execute( 'authToken()' ) ) ) )
            }

        }

    }

    response {

        status OK()

        body( file("carDetails.json" ) )

        headers {
            contentType( applicationJson() )
        }

    }

}

