package seg3x02.employeeGql.resolvers

import graphql.GraphQLError
import org.springframework.graphql.data.method.annotation.GraphQlExceptionHandler
import org.springframework.graphql.execution.ErrorType
import org.springframework.web.bind.annotation.ControllerAdvice

@ControllerAdvice
class ExceptionHandler {
    @GraphQlExceptionHandler
    fun handle(ex: Exception?): GraphQLError? {
        return GraphQLError.newError().errorType(ErrorType.BAD_REQUEST).message("Error").build()
    }
}