package com.tools.apirestredis.config;

import com.tools.apirestredis.exception.ValidationException;

/**
 * Created by fdcosta on 11/30/17.
 */
public enum OperationResult {

    OK("0000", "OK"),
    DUPLICATED_FIELD("0001", "Já existe um objeto na base de dados com um ou mais campos únicos identicos ao a ser inserido."),
    DATABASE_ERROR("0002", "Erro de banco de dados!"),
    CONSTRAINT_VIOLATION("0003", "Erro de banco de dados!"),
    RUNTIME_ERROR("0004", "Erro inesperado!"),
    PROGRAMMING_CANCELLED("0005", "Programação cancelada não pode ser alterada!"),
    PROGRAMMING_ALREADY_INITIATED("0006", "Programação inciada não pode ser alterada!"),
    PROGRAMMING_DATE_INVALID("0007", "Impossível fazer programação para data retroativa!"),
    SWITCHING_PERCENTAGE_OUT_OF_RANGE("0008", "Percentual de chaveamento deve estar entre 1 e 100%!"),
    SAME_VERSION_ERROR("0009", "Impossível fazer programação para mesma versão!"),
    DIFF_MODEL_ERROR("0010", "Impossível fazer programação de versões de modelos diferentes!"),
    VERSION_PROGRAMMED_ERROR("0011", "Impossível alterar versão com telecarga programada!"),
    VERSION_INACTIVE_ERROR("0012", "Impossível programar telecarga para versão inativa!"),
    INVALID_DATE_FORMAT_ERROR("0013", "Formato de data inválido!"),
    SERIAL_OUT_OF_RANGE("0014", "Serial deve ter entre 8 e 20 caracteres!"),
    PROGRAMMING_MISMATCH_MODEL("0015", "Impossível programar telecarga para uma versão de um modelo diferente"),
    DUPLICATED_MANUFACTURER("0016", "Fabricante já cadastrado!"),
    DUPLICATED_MODEL("0017", "Modelo já cadastrado!"),
    DUPLICATED_TERMINAL("0018", "Terminal já cadastrado!"),
    DUPLICATED_VERSION("0019", "Versão já cadastrada!"),
    DUPLICATED_PROGRAMMING_TERMINAL("0020", "Já existem terminais programados para essa versão de destino!"),
    UNKNOWN_SERIAL("0021", "Serial não cadastrado!"),
    NO_PROGRAMMING_TERMINAL_FOUND("0022", "Programação por serial não encontrada!"),
    NO_PROGRAMMING_VERSION_FOUND("0023", "Versão não possui programação!"),
    VERSION_DESCRIPTION_OUT_OF_RANGE("0024", "Descrição de versão deve ter entre 5 e 45 caracteres"),
    DUPLICATED_CODAPP("0025", "Application Code já cadastrado!"),
    USER_NOT_LOGGED("0026", "Usuário não logado!"),
    PERMISSION_DENIED("0027", "Usuário não tem permissão para acesso ao sistema!"),
    MISSING_MANDATORY_FIELD("0028", "Campo obrigatório não preenchido!"),
    VERSION_NOT_FOUND("0029", "Versão não localizada!"),
    IMPOSSIBLE_TO_CHANGE_FILE("0030", "Não é possível alterar o arquivo de uma versão com programações."),
    NO_TERMINAL_IN_VERSION("0031", "Não há nenhum terminal nessa versão!"),
    NO_TERMINAL_IN_MODEL("0032", "Não existe terminal cadastrado para este modelo!"),
    INVALID_CODAPP("0033", "Application Code inválido!"),
    FEATURE_NOT_FOUND("0034", "Feature não localizada!"),
    VERSION_IN_USE_ERROR("0035", "Não é possível alterar uma versão com terminais nela!"),
    DUPLICATED_FEATURE("0036", "Feature já cadastrada!"),
    DUPLICATED_PROGRAMMING_BATCH("0037", "Uma ou mais programações já cadastradas, verifique log para mais informações!"),
    VERSION_OR_MODEL_EMPTY_S3("0038", "Impossível enviar um arquivo para o S3 com o modelo ou versão vazios"),
    NO_VERSION_FOR_MODEL("0039", "Não existem versões cadastradas para este modelo!"),
    UNSIGNED_PACKAGE("0040", "Não é possível cadastrar pacotes sem assinatura em produção!"),
    PROGRAMMING_ERROR("0041", "Erro durante a programação!"),
    MOBILE_CONNECTION_ERROR("0042", "Erro ao enviar request ao mobile!"),
    DUPLICATED_OS("0043", "Sistema Operacional já cadastrado!"),
    ID_OR_MODEL_EMPTY_S3("0044", "Impossível enviar um arquivo de SO para o S3 sem o modelo ou id"),
    DUPLICATED_PROGRAMMING_VERSION("0045", "Já existe versões de origem programadas para essa versão de destino!"),
    MOVE_FILE_ERROR_S3("0046", "Erro ao mover arquivo no S3. Por favor, contate equipe responsável."),
    OS_IN_USE_ERROR("0047", "Não é possível alterar SO com versão associada à ele!"),
    OS_NOT_FOUND("0048", "Não existe SO para esse modelo!"),
    INVALID_ZIP_STRUCTURE("0049", "Impossível cadastrar arquivos .zip com subdiretórios!"),
    DUPLICATED_PROGRAMMING("0050", "Programação já existe!"),
    PILOT_GROUP_BY_MODEL_NOT_FOUND("0051", "Não há grupo de piloto para esse modelo!"),
    PILOT_GROUP_NOT_FOUND("0052", "Não há grupos de piloto cadastrados!"),
    PILOT_GROUP_MISMATCH_MODEL("0053", "Impossível inserir terminal no grupo de piloto com um modelo diferente"),
    DUPLICATED_PILOT_GROUP("0054", "Grupo de piloto com esse nome já existe!"),
    ACTIVE_PROGRAMMING_NOT_FOUND("0055", "Não existe Programação ativa para esse modelo!"),
    SUBFOLDER_NOT_ALLOWED("0056", "Não é possível cadastrar pacotes com subpastas!");

    private String description;
    private String errorCode;

    OperationResult(String errorCode, String description) {
        this.errorCode = errorCode;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void throwException() throws ValidationException {
        throw new ValidationException(this.errorCode, this.description);
    }
}
