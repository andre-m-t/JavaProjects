package poov.cadastrovacina.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import poov.cadastrovacina.dao.core.GenericJDBCDAO;
import poov.cadastrovacina.model.Lote;
import poov.cadastrovacina.model.Situacao;

public class LoteDAO extends GenericJDBCDAO<Lote, Long> {

    public LoteDAO(Connection conexao) {
        super(conexao);
    }

    private static final String FIND_ALL_QUERY = "SELECT * FROM lote inner join vacina on vacina.codigo = lote.codigo_vacina WHERE lote.situacao = 'ATIVO' ";
    private static final String FIND_BY_KEY_QUERY = FIND_ALL_QUERY + "AND lote.codigo=? ";
    //private static final String FIND_BY_NAME_LIKE_QUERY = FIND_ALL_QUERY + "AND validade = ? ";
    private static final String UPDATE_QUERY = "UPDATE lote SET validade =?, nro_doses_do_lote=?, nro_doses_atual=?, situacao = ? WHERE codigo=?";
    private static final String CREATE_QUERY = "INSERT INTO Lote (validade, nro_doses_do_lote, nro_doses_atual, situacao, codigo_vacina) VALUES (?, ?,?,?,?)";
    private static final String REMOVE_QUERY = "DELETE FROM lote WHERE codigo=?";

    @Override
    protected Lote toEntity(ResultSet resultSet) throws SQLException {
        Lote lote = new Lote();
        lote.setCodigo(resultSet.getLong("codigo"));
        lote.setValidade(resultSet.getDate("validade").toLocalDate());
        lote.setNroDosesAtual(resultSet.getInt("nro_doses_atual"));
        lote.setNroDosesLote(resultSet.getInt("nro_doses_do_lote"));
        lote.getVacina().setCodigo(resultSet.getLong("codigo_vacina"));
        if (resultSet.getString("situacao").equals("ATIVO")) {
            lote.getVacina().setSituacao(Situacao.ATIVO);
        } else {
            lote.getVacina().setSituacao(Situacao.INATIVO);
        }
        return lote;
    }

    @Override
    protected void addParameters(PreparedStatement resultSet, Lote entity) throws SQLException {
        resultSet.setDate(1, Date.valueOf(entity.getValidade()));
        resultSet.setInt(2, entity.getNroDosesLote());
        resultSet.setInt(3, entity.getNroDosesAtual());
        resultSet.setString(4, entity.getVacina().getSituacao().toString());
        resultSet.setLong(5, entity.getVacina().getCodigo());
        if (entity.getCodigo() != null) {
            resultSet.setLong(6, entity.getCodigo());
        }
    }

    @Override
    protected String findByKeyQuery() {
        return FIND_BY_KEY_QUERY;
    }

    @Override
    protected String findAllQuery() {
        return FIND_ALL_QUERY;
    }

    @Override
    protected String updateQuery() {
        return UPDATE_QUERY;
    }

    @Override
    protected String createQuery() {
        return CREATE_QUERY;
    }

    @Override
    protected String removeQuery() {
        return REMOVE_QUERY;
    }

    // public List<Lote> findByNameLike(String nome) {
    //     try {
    //         PreparedStatement statement = connection.prepareStatement(FIND_BY_NAME_LIKE_QUERY);
    //         statement.setString(1, "%" + nome + "%");
    //         ResultSet resultSet = statement.executeQuery();
    //         return toEntityList(resultSet);
    //     } catch (SQLException e) {
    //         showSQLException(e);
    //     }
    //     return new ArrayList<Lote>();
    // }

    @Override
    protected void setKeyInStatementFromEntity(PreparedStatement statement, Lote entity) throws SQLException {
        statement.setLong(1, entity.getCodigo());
    }

    @Override
    protected void setKeyInStatement(PreparedStatement statement, Long key) throws SQLException {
        statement.setLong(1, key);
    }

    @Override
    protected void setKeyInEntity(ResultSet rs, Lote entity) throws SQLException {
        entity.setCodigo(rs.getLong(1));
    }

}
