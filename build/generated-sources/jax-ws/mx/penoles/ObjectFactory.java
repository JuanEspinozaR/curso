
package mx.penoles;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.penoles package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeletePendienteRowResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "deletePendienteRowResponse");
    private final static QName _GetUsuarioResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "getUsuarioResponse");
    private final static QName _GetEntidadesListResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "getEntidadesListResponse");
    private final static QName _GetPendienteAsuntoGrid_QNAME = new QName("http://service.reunion.bsc.penoles/", "getPendienteAsuntoGrid");
    private final static QName _UpdatePendienteRow_QNAME = new QName("http://service.reunion.bsc.penoles/", "updatePendienteRow");
    private final static QName _InsertarComentario_QNAME = new QName("http://service.reunion.bsc.penoles/", "insertarComentario");
    private final static QName _FillPendienteRowResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "fillPendienteRowResponse");
    private final static QName _VerificaResponsableUsuario_QNAME = new QName("http://service.reunion.bsc.penoles/", "verificaResponsableUsuario");
    private final static QName _GetUsuarios_QNAME = new QName("http://service.reunion.bsc.penoles/", "getUsuarios");
    private final static QName _GetEntidadesPadreList_QNAME = new QName("http://service.reunion.bsc.penoles/", "getEntidadesPadreList");
    private final static QName _InsertPendienteRow_QNAME = new QName("http://service.reunion.bsc.penoles/", "insertPendienteRow");
    private final static QName _GetEntidadesPadreListResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "getEntidadesPadreListResponse");
    private final static QName _GetEntidadesList_QNAME = new QName("http://service.reunion.bsc.penoles/", "getEntidadesList");
    private final static QName _FinalizaAsunto_QNAME = new QName("http://service.reunion.bsc.penoles/", "finalizaAsunto");
    private final static QName _FillAsuntoRow_QNAME = new QName("http://service.reunion.bsc.penoles/", "fillAsuntoRow");
    private final static QName _GetRelevanteAsuntoGrid_QNAME = new QName("http://service.reunion.bsc.penoles/", "getRelevanteAsuntoGrid");
    private final static QName _InsertarComentarioResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "insertarComentarioResponse");
    private final static QName _PingReunionResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "pingReunionResponse");
    private final static QName _GetUsuariosResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "getUsuariosResponse");
    private final static QName _GetAsistenteReunionGridResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "getAsistenteReunionGridResponse");
    private final static QName _SaveListaAsistentesResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "saveListaAsistentesResponse");
    private final static QName _Exception_QNAME = new QName("http://service.reunion.bsc.penoles/", "Exception");
    private final static QName _GetPendienteEstadisticaGridResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "getPendienteEstadisticaGridResponse");
    private final static QName _InsertAsuntoRow_QNAME = new QName("http://service.reunion.bsc.penoles/", "insertAsuntoRow");
    private final static QName _InsertAsuntoRowResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "insertAsuntoRowResponse");
    private final static QName _GetMultivaluadaRows_QNAME = new QName("http://service.reunion.bsc.penoles/", "getMultivaluadaRows");
    private final static QName _GetEntidadesHijasListResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "getEntidadesHijasListResponse");
    private final static QName _GetEntidadesHijasList_QNAME = new QName("http://service.reunion.bsc.penoles/", "getEntidadesHijasList");
    private final static QName _GetProyectoAsuntoGridResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "getProyectoAsuntoGridResponse");
    private final static QName _GetUsuario_QNAME = new QName("http://service.reunion.bsc.penoles/", "getUsuario");
    private final static QName _GetGridColumnsResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "getGridColumnsResponse");
    private final static QName _GetPendienteAsuntoGridResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "getPendienteAsuntoGridResponse");
    private final static QName _GetGridColumns_QNAME = new QName("http://service.reunion.bsc.penoles/", "getGridColumns");
    private final static QName _GetAsuntoReunionGrid_QNAME = new QName("http://service.reunion.bsc.penoles/", "getAsuntoReunionGrid");
    private final static QName _FinalizaAsuntoResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "finalizaAsuntoResponse");
    private final static QName _PingReunion_QNAME = new QName("http://service.reunion.bsc.penoles/", "pingReunion");
    private final static QName _GetRelevanteAsuntoGridResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "getRelevanteAsuntoGridResponse");
    private final static QName _ActivateReunionResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "activateReunionResponse");
    private final static QName _UpdatePendienteRowResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "updatePendienteRowResponse");
    private final static QName _AgendaNuevaReunion_QNAME = new QName("http://service.reunion.bsc.penoles/", "agendaNuevaReunion");
    private final static QName _GetReunionesGrid_QNAME = new QName("http://service.reunion.bsc.penoles/", "getReunionesGrid");
    private final static QName _DeletePendienteRow_QNAME = new QName("http://service.reunion.bsc.penoles/", "deletePendienteRow");
    private final static QName _GetAsuntoReunionGridResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "getAsuntoReunionGridResponse");
    private final static QName _GetPendienteEstadisticaGrid_QNAME = new QName("http://service.reunion.bsc.penoles/", "getPendienteEstadisticaGrid");
    private final static QName _SaveListaAsistentes_QNAME = new QName("http://service.reunion.bsc.penoles/", "saveListaAsistentes");
    private final static QName _VerificaResponsableUsuarioResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "verificaResponsableUsuarioResponse");
    private final static QName _AgendaNuevaReunionResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "agendaNuevaReunionResponse");
    private final static QName _ActivateReunion_QNAME = new QName("http://service.reunion.bsc.penoles/", "activateReunion");
    private final static QName _GetMultivaluadaRowsResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "getMultivaluadaRowsResponse");
    private final static QName _FillPendienteRow_QNAME = new QName("http://service.reunion.bsc.penoles/", "fillPendienteRow");
    private final static QName _GetReunionesGridResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "getReunionesGridResponse");
    private final static QName _GetProyectoAsuntoGrid_QNAME = new QName("http://service.reunion.bsc.penoles/", "getProyectoAsuntoGrid");
    private final static QName _GetAsistenteReunionGrid_QNAME = new QName("http://service.reunion.bsc.penoles/", "getAsistenteReunionGrid");
    private final static QName _FillAsuntoRowResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "fillAsuntoRowResponse");
    private final static QName _InsertPendienteRowResponse_QNAME = new QName("http://service.reunion.bsc.penoles/", "insertPendienteRowResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.penoles
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PendienteRow }
     * 
     */
    public PendienteRow createPendienteRow() {
        return new PendienteRow();
    }

    /**
     * Create an instance of {@link PendienteServiceRow }
     * 
     */
    public PendienteServiceRow createPendienteServiceRow() {
        return new PendienteServiceRow();
    }

    /**
     * Create an instance of {@link RelevanteServiceRow }
     * 
     */
    public RelevanteServiceRow createRelevanteServiceRow() {
        return new RelevanteServiceRow();
    }

    /**
     * Create an instance of {@link PendienteGridRow }
     * 
     */
    public PendienteGridRow createPendienteGridRow() {
        return new PendienteGridRow();
    }

    /**
     * Create an instance of {@link IndicadorDesviacionRow }
     * 
     */
    public IndicadorDesviacionRow createIndicadorDesviacionRow() {
        return new IndicadorDesviacionRow();
    }

    /**
     * Create an instance of {@link ProyectoServiceRow }
     * 
     */
    public ProyectoServiceRow createProyectoServiceRow() {
        return new ProyectoServiceRow();
    }

    /**
     * Create an instance of {@link AsuntoRow }
     * 
     */
    public AsuntoRow createAsuntoRow() {
        return new AsuntoRow();
    }

    /**
     * Create an instance of {@link AsuntoServiceRow }
     * 
     */
    public AsuntoServiceRow createAsuntoServiceRow() {
        return new AsuntoServiceRow();
    }

    /**
     * Create an instance of {@link SeguimientoRow }
     * 
     */
    public SeguimientoRow createSeguimientoRow() {
        return new SeguimientoRow();
    }

    /**
     * Create an instance of {@link GetProyectoAsuntoGrid }
     * 
     */
    public GetProyectoAsuntoGrid createGetProyectoAsuntoGrid() {
        return new GetProyectoAsuntoGrid();
    }

    /**
     * Create an instance of {@link FillPendienteRow }
     * 
     */
    public FillPendienteRow createFillPendienteRow() {
        return new FillPendienteRow();
    }

    /**
     * Create an instance of {@link GetReunionesGridResponse }
     * 
     */
    public GetReunionesGridResponse createGetReunionesGridResponse() {
        return new GetReunionesGridResponse();
    }

    /**
     * Create an instance of {@link AgendaNuevaReunionResponse }
     * 
     */
    public AgendaNuevaReunionResponse createAgendaNuevaReunionResponse() {
        return new AgendaNuevaReunionResponse();
    }

    /**
     * Create an instance of {@link ActivateReunion }
     * 
     */
    public ActivateReunion createActivateReunion() {
        return new ActivateReunion();
    }

    /**
     * Create an instance of {@link GetMultivaluadaRowsResponse }
     * 
     */
    public GetMultivaluadaRowsResponse createGetMultivaluadaRowsResponse() {
        return new GetMultivaluadaRowsResponse();
    }

    /**
     * Create an instance of {@link FillAsuntoRowResponse }
     * 
     */
    public FillAsuntoRowResponse createFillAsuntoRowResponse() {
        return new FillAsuntoRowResponse();
    }

    /**
     * Create an instance of {@link InsertPendienteRowResponse }
     * 
     */
    public InsertPendienteRowResponse createInsertPendienteRowResponse() {
        return new InsertPendienteRowResponse();
    }

    /**
     * Create an instance of {@link GetAsistenteReunionGrid }
     * 
     */
    public GetAsistenteReunionGrid createGetAsistenteReunionGrid() {
        return new GetAsistenteReunionGrid();
    }

    /**
     * Create an instance of {@link UpdatePendienteRowResponse }
     * 
     */
    public UpdatePendienteRowResponse createUpdatePendienteRowResponse() {
        return new UpdatePendienteRowResponse();
    }

    /**
     * Create an instance of {@link GetAsuntoReunionGrid }
     * 
     */
    public GetAsuntoReunionGrid createGetAsuntoReunionGrid() {
        return new GetAsuntoReunionGrid();
    }

    /**
     * Create an instance of {@link FinalizaAsuntoResponse }
     * 
     */
    public FinalizaAsuntoResponse createFinalizaAsuntoResponse() {
        return new FinalizaAsuntoResponse();
    }

    /**
     * Create an instance of {@link ActivateReunionResponse }
     * 
     */
    public ActivateReunionResponse createActivateReunionResponse() {
        return new ActivateReunionResponse();
    }

    /**
     * Create an instance of {@link GetRelevanteAsuntoGridResponse }
     * 
     */
    public GetRelevanteAsuntoGridResponse createGetRelevanteAsuntoGridResponse() {
        return new GetRelevanteAsuntoGridResponse();
    }

    /**
     * Create an instance of {@link PingReunion }
     * 
     */
    public PingReunion createPingReunion() {
        return new PingReunion();
    }

    /**
     * Create an instance of {@link GetGridColumns }
     * 
     */
    public GetGridColumns createGetGridColumns() {
        return new GetGridColumns();
    }

    /**
     * Create an instance of {@link GetPendienteAsuntoGridResponse }
     * 
     */
    public GetPendienteAsuntoGridResponse createGetPendienteAsuntoGridResponse() {
        return new GetPendienteAsuntoGridResponse();
    }

    /**
     * Create an instance of {@link GetAsuntoReunionGridResponse }
     * 
     */
    public GetAsuntoReunionGridResponse createGetAsuntoReunionGridResponse() {
        return new GetAsuntoReunionGridResponse();
    }

    /**
     * Create an instance of {@link VerificaResponsableUsuarioResponse }
     * 
     */
    public VerificaResponsableUsuarioResponse createVerificaResponsableUsuarioResponse() {
        return new VerificaResponsableUsuarioResponse();
    }

    /**
     * Create an instance of {@link SaveListaAsistentes }
     * 
     */
    public SaveListaAsistentes createSaveListaAsistentes() {
        return new SaveListaAsistentes();
    }

    /**
     * Create an instance of {@link GetPendienteEstadisticaGrid }
     * 
     */
    public GetPendienteEstadisticaGrid createGetPendienteEstadisticaGrid() {
        return new GetPendienteEstadisticaGrid();
    }

    /**
     * Create an instance of {@link DeletePendienteRow }
     * 
     */
    public DeletePendienteRow createDeletePendienteRow() {
        return new DeletePendienteRow();
    }

    /**
     * Create an instance of {@link AgendaNuevaReunion }
     * 
     */
    public AgendaNuevaReunion createAgendaNuevaReunion() {
        return new AgendaNuevaReunion();
    }

    /**
     * Create an instance of {@link GetReunionesGrid }
     * 
     */
    public GetReunionesGrid createGetReunionesGrid() {
        return new GetReunionesGrid();
    }

    /**
     * Create an instance of {@link SaveListaAsistentesResponse }
     * 
     */
    public SaveListaAsistentesResponse createSaveListaAsistentesResponse() {
        return new SaveListaAsistentesResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetPendienteEstadisticaGridResponse }
     * 
     */
    public GetPendienteEstadisticaGridResponse createGetPendienteEstadisticaGridResponse() {
        return new GetPendienteEstadisticaGridResponse();
    }

    /**
     * Create an instance of {@link InsertAsuntoRow }
     * 
     */
    public InsertAsuntoRow createInsertAsuntoRow() {
        return new InsertAsuntoRow();
    }

    /**
     * Create an instance of {@link InsertAsuntoRowResponse }
     * 
     */
    public InsertAsuntoRowResponse createInsertAsuntoRowResponse() {
        return new InsertAsuntoRowResponse();
    }

    /**
     * Create an instance of {@link GetUsuariosResponse }
     * 
     */
    public GetUsuariosResponse createGetUsuariosResponse() {
        return new GetUsuariosResponse();
    }

    /**
     * Create an instance of {@link GetAsistenteReunionGridResponse }
     * 
     */
    public GetAsistenteReunionGridResponse createGetAsistenteReunionGridResponse() {
        return new GetAsistenteReunionGridResponse();
    }

    /**
     * Create an instance of {@link PingReunionResponse }
     * 
     */
    public PingReunionResponse createPingReunionResponse() {
        return new PingReunionResponse();
    }

    /**
     * Create an instance of {@link GetRelevanteAsuntoGrid }
     * 
     */
    public GetRelevanteAsuntoGrid createGetRelevanteAsuntoGrid() {
        return new GetRelevanteAsuntoGrid();
    }

    /**
     * Create an instance of {@link InsertarComentarioResponse }
     * 
     */
    public InsertarComentarioResponse createInsertarComentarioResponse() {
        return new InsertarComentarioResponse();
    }

    /**
     * Create an instance of {@link GetGridColumnsResponse }
     * 
     */
    public GetGridColumnsResponse createGetGridColumnsResponse() {
        return new GetGridColumnsResponse();
    }

    /**
     * Create an instance of {@link GetProyectoAsuntoGridResponse }
     * 
     */
    public GetProyectoAsuntoGridResponse createGetProyectoAsuntoGridResponse() {
        return new GetProyectoAsuntoGridResponse();
    }

    /**
     * Create an instance of {@link GetUsuario }
     * 
     */
    public GetUsuario createGetUsuario() {
        return new GetUsuario();
    }

    /**
     * Create an instance of {@link GetMultivaluadaRows }
     * 
     */
    public GetMultivaluadaRows createGetMultivaluadaRows() {
        return new GetMultivaluadaRows();
    }

    /**
     * Create an instance of {@link GetEntidadesHijasListResponse }
     * 
     */
    public GetEntidadesHijasListResponse createGetEntidadesHijasListResponse() {
        return new GetEntidadesHijasListResponse();
    }

    /**
     * Create an instance of {@link GetEntidadesHijasList }
     * 
     */
    public GetEntidadesHijasList createGetEntidadesHijasList() {
        return new GetEntidadesHijasList();
    }

    /**
     * Create an instance of {@link FillPendienteRowResponse }
     * 
     */
    public FillPendienteRowResponse createFillPendienteRowResponse() {
        return new FillPendienteRowResponse();
    }

    /**
     * Create an instance of {@link GetPendienteAsuntoGrid }
     * 
     */
    public GetPendienteAsuntoGrid createGetPendienteAsuntoGrid() {
        return new GetPendienteAsuntoGrid();
    }

    /**
     * Create an instance of {@link UpdatePendienteRow }
     * 
     */
    public UpdatePendienteRow createUpdatePendienteRow() {
        return new UpdatePendienteRow();
    }

    /**
     * Create an instance of {@link InsertarComentario }
     * 
     */
    public InsertarComentario createInsertarComentario() {
        return new InsertarComentario();
    }

    /**
     * Create an instance of {@link GetEntidadesListResponse }
     * 
     */
    public GetEntidadesListResponse createGetEntidadesListResponse() {
        return new GetEntidadesListResponse();
    }

    /**
     * Create an instance of {@link DeletePendienteRowResponse }
     * 
     */
    public DeletePendienteRowResponse createDeletePendienteRowResponse() {
        return new DeletePendienteRowResponse();
    }

    /**
     * Create an instance of {@link GetUsuarioResponse }
     * 
     */
    public GetUsuarioResponse createGetUsuarioResponse() {
        return new GetUsuarioResponse();
    }

    /**
     * Create an instance of {@link FillAsuntoRow }
     * 
     */
    public FillAsuntoRow createFillAsuntoRow() {
        return new FillAsuntoRow();
    }

    /**
     * Create an instance of {@link FinalizaAsunto }
     * 
     */
    public FinalizaAsunto createFinalizaAsunto() {
        return new FinalizaAsunto();
    }

    /**
     * Create an instance of {@link GetEntidadesPadreListResponse }
     * 
     */
    public GetEntidadesPadreListResponse createGetEntidadesPadreListResponse() {
        return new GetEntidadesPadreListResponse();
    }

    /**
     * Create an instance of {@link GetEntidadesList }
     * 
     */
    public GetEntidadesList createGetEntidadesList() {
        return new GetEntidadesList();
    }

    /**
     * Create an instance of {@link GetEntidadesPadreList }
     * 
     */
    public GetEntidadesPadreList createGetEntidadesPadreList() {
        return new GetEntidadesPadreList();
    }

    /**
     * Create an instance of {@link GetUsuarios }
     * 
     */
    public GetUsuarios createGetUsuarios() {
        return new GetUsuarios();
    }

    /**
     * Create an instance of {@link InsertPendienteRow }
     * 
     */
    public InsertPendienteRow createInsertPendienteRow() {
        return new InsertPendienteRow();
    }

    /**
     * Create an instance of {@link VerificaResponsableUsuario }
     * 
     */
    public VerificaResponsableUsuario createVerificaResponsableUsuario() {
        return new VerificaResponsableUsuario();
    }

    /**
     * Create an instance of {@link EstrategiaIndicadorRow }
     * 
     */
    public EstrategiaIndicadorRow createEstrategiaIndicadorRow() {
        return new EstrategiaIndicadorRow();
    }

    /**
     * Create an instance of {@link PerspectivaRow }
     * 
     */
    public PerspectivaRow createPerspectivaRow() {
        return new PerspectivaRow();
    }

    /**
     * Create an instance of {@link AsistenteRow }
     * 
     */
    public AsistenteRow createAsistenteRow() {
        return new AsistenteRow();
    }

    /**
     * Create an instance of {@link EntidadRow }
     * 
     */
    public EntidadRow createEntidadRow() {
        return new EntidadRow();
    }

    /**
     * Create an instance of {@link ResponsableRow }
     * 
     */
    public ResponsableRow createResponsableRow() {
        return new ResponsableRow();
    }

    /**
     * Create an instance of {@link MultivaluadaRow }
     * 
     */
    public MultivaluadaRow createMultivaluadaRow() {
        return new MultivaluadaRow();
    }

    /**
     * Create an instance of {@link UsuarioRow }
     * 
     */
    public UsuarioRow createUsuarioRow() {
        return new UsuarioRow();
    }

    /**
     * Create an instance of {@link Columna }
     * 
     */
    public Columna createColumna() {
        return new Columna();
    }

    /**
     * Create an instance of {@link IndicadorRow }
     * 
     */
    public IndicadorRow createIndicadorRow() {
        return new IndicadorRow();
    }

    /**
     * Create an instance of {@link EstrategiaRow }
     * 
     */
    public EstrategiaRow createEstrategiaRow() {
        return new EstrategiaRow();
    }

    /**
     * Create an instance of {@link IndicadorDesviacionEntidadRow }
     * 
     */
    public IndicadorDesviacionEntidadRow createIndicadorDesviacionEntidadRow() {
        return new IndicadorDesviacionEntidadRow();
    }

    /**
     * Create an instance of {@link RangoSecuenciaRow }
     * 
     */
    public RangoSecuenciaRow createRangoSecuenciaRow() {
        return new RangoSecuenciaRow();
    }

    /**
     * Create an instance of {@link PendienteEstadisticaRow }
     * 
     */
    public PendienteEstadisticaRow createPendienteEstadisticaRow() {
        return new PendienteEstadisticaRow();
    }

    /**
     * Create an instance of {@link EntidadResponsableRow }
     * 
     */
    public EntidadResponsableRow createEntidadResponsableRow() {
        return new EntidadResponsableRow();
    }

    /**
     * Create an instance of {@link RelevanteRow }
     * 
     */
    public RelevanteRow createRelevanteRow() {
        return new RelevanteRow();
    }

    /**
     * Create an instance of {@link BusinessUnitRow }
     * 
     */
    public BusinessUnitRow createBusinessUnitRow() {
        return new BusinessUnitRow();
    }

    /**
     * Create an instance of {@link ProyectoIndicadorRow }
     * 
     */
    public ProyectoIndicadorRow createProyectoIndicadorRow() {
        return new ProyectoIndicadorRow();
    }

    /**
     * Create an instance of {@link RangoRow }
     * 
     */
    public RangoRow createRangoRow() {
        return new RangoRow();
    }

    /**
     * Create an instance of {@link DocumentoRow }
     * 
     */
    public DocumentoRow createDocumentoRow() {
        return new DocumentoRow();
    }

    /**
     * Create an instance of {@link NivelRow }
     * 
     */
    public NivelRow createNivelRow() {
        return new NivelRow();
    }

    /**
     * Create an instance of {@link ReunionRow }
     * 
     */
    public ReunionRow createReunionRow() {
        return new ReunionRow();
    }

    /**
     * Create an instance of {@link UnidadMedidaRow }
     * 
     */
    public UnidadMedidaRow createUnidadMedidaRow() {
        return new UnidadMedidaRow();
    }

    /**
     * Create an instance of {@link ProyectoRow }
     * 
     */
    public ProyectoRow createProyectoRow() {
        return new ProyectoRow();
    }

    /**
     * Create an instance of {@link IndicadorDesviacionAccionRow }
     * 
     */
    public IndicadorDesviacionAccionRow createIndicadorDesviacionAccionRow() {
        return new IndicadorDesviacionAccionRow();
    }

    /**
     * Create an instance of {@link PendienteRow.ResponsableList }
     * 
     */
    public PendienteRow.ResponsableList createPendienteRowResponsableList() {
        return new PendienteRow.ResponsableList();
    }

    /**
     * Create an instance of {@link PendienteRow.SeguimientoList }
     * 
     */
    public PendienteRow.SeguimientoList createPendienteRowSeguimientoList() {
        return new PendienteRow.SeguimientoList();
    }

    /**
     * Create an instance of {@link PendienteRow.DocumentosList }
     * 
     */
    public PendienteRow.DocumentosList createPendienteRowDocumentosList() {
        return new PendienteRow.DocumentosList();
    }

    /**
     * Create an instance of {@link PendienteServiceRow.PendienteList }
     * 
     */
    public PendienteServiceRow.PendienteList createPendienteServiceRowPendienteList() {
        return new PendienteServiceRow.PendienteList();
    }

    /**
     * Create an instance of {@link RelevanteServiceRow.RelevanteList }
     * 
     */
    public RelevanteServiceRow.RelevanteList createRelevanteServiceRowRelevanteList() {
        return new RelevanteServiceRow.RelevanteList();
    }

    /**
     * Create an instance of {@link PendienteGridRow.PendienteList }
     * 
     */
    public PendienteGridRow.PendienteList createPendienteGridRowPendienteList() {
        return new PendienteGridRow.PendienteList();
    }

    /**
     * Create an instance of {@link IndicadorDesviacionRow.IndicadorEntidadList }
     * 
     */
    public IndicadorDesviacionRow.IndicadorEntidadList createIndicadorDesviacionRowIndicadorEntidadList() {
        return new IndicadorDesviacionRow.IndicadorEntidadList();
    }

    /**
     * Create an instance of {@link IndicadorDesviacionRow.AccionList }
     * 
     */
    public IndicadorDesviacionRow.AccionList createIndicadorDesviacionRowAccionList() {
        return new IndicadorDesviacionRow.AccionList();
    }

    /**
     * Create an instance of {@link ProyectoServiceRow.ProyectoList }
     * 
     */
    public ProyectoServiceRow.ProyectoList createProyectoServiceRowProyectoList() {
        return new ProyectoServiceRow.ProyectoList();
    }

    /**
     * Create an instance of {@link AsuntoRow.PendienteList }
     * 
     */
    public AsuntoRow.PendienteList createAsuntoRowPendienteList() {
        return new AsuntoRow.PendienteList();
    }

    /**
     * Create an instance of {@link AsuntoServiceRow.AsuntoList }
     * 
     */
    public AsuntoServiceRow.AsuntoList createAsuntoServiceRowAsuntoList() {
        return new AsuntoServiceRow.AsuntoList();
    }

    /**
     * Create an instance of {@link SeguimientoRow.DocumentoList }
     * 
     */
    public SeguimientoRow.DocumentoList createSeguimientoRowDocumentoList() {
        return new SeguimientoRow.DocumentoList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePendienteRowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "deletePendienteRowResponse")
    public JAXBElement<DeletePendienteRowResponse> createDeletePendienteRowResponse(DeletePendienteRowResponse value) {
        return new JAXBElement<DeletePendienteRowResponse>(_DeletePendienteRowResponse_QNAME, DeletePendienteRowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getUsuarioResponse")
    public JAXBElement<GetUsuarioResponse> createGetUsuarioResponse(GetUsuarioResponse value) {
        return new JAXBElement<GetUsuarioResponse>(_GetUsuarioResponse_QNAME, GetUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntidadesListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getEntidadesListResponse")
    public JAXBElement<GetEntidadesListResponse> createGetEntidadesListResponse(GetEntidadesListResponse value) {
        return new JAXBElement<GetEntidadesListResponse>(_GetEntidadesListResponse_QNAME, GetEntidadesListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPendienteAsuntoGrid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getPendienteAsuntoGrid")
    public JAXBElement<GetPendienteAsuntoGrid> createGetPendienteAsuntoGrid(GetPendienteAsuntoGrid value) {
        return new JAXBElement<GetPendienteAsuntoGrid>(_GetPendienteAsuntoGrid_QNAME, GetPendienteAsuntoGrid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePendienteRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "updatePendienteRow")
    public JAXBElement<UpdatePendienteRow> createUpdatePendienteRow(UpdatePendienteRow value) {
        return new JAXBElement<UpdatePendienteRow>(_UpdatePendienteRow_QNAME, UpdatePendienteRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarComentario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "insertarComentario")
    public JAXBElement<InsertarComentario> createInsertarComentario(InsertarComentario value) {
        return new JAXBElement<InsertarComentario>(_InsertarComentario_QNAME, InsertarComentario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillPendienteRowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "fillPendienteRowResponse")
    public JAXBElement<FillPendienteRowResponse> createFillPendienteRowResponse(FillPendienteRowResponse value) {
        return new JAXBElement<FillPendienteRowResponse>(_FillPendienteRowResponse_QNAME, FillPendienteRowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaResponsableUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "verificaResponsableUsuario")
    public JAXBElement<VerificaResponsableUsuario> createVerificaResponsableUsuario(VerificaResponsableUsuario value) {
        return new JAXBElement<VerificaResponsableUsuario>(_VerificaResponsableUsuario_QNAME, VerificaResponsableUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getUsuarios")
    public JAXBElement<GetUsuarios> createGetUsuarios(GetUsuarios value) {
        return new JAXBElement<GetUsuarios>(_GetUsuarios_QNAME, GetUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntidadesPadreList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getEntidadesPadreList")
    public JAXBElement<GetEntidadesPadreList> createGetEntidadesPadreList(GetEntidadesPadreList value) {
        return new JAXBElement<GetEntidadesPadreList>(_GetEntidadesPadreList_QNAME, GetEntidadesPadreList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPendienteRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "insertPendienteRow")
    public JAXBElement<InsertPendienteRow> createInsertPendienteRow(InsertPendienteRow value) {
        return new JAXBElement<InsertPendienteRow>(_InsertPendienteRow_QNAME, InsertPendienteRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntidadesPadreListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getEntidadesPadreListResponse")
    public JAXBElement<GetEntidadesPadreListResponse> createGetEntidadesPadreListResponse(GetEntidadesPadreListResponse value) {
        return new JAXBElement<GetEntidadesPadreListResponse>(_GetEntidadesPadreListResponse_QNAME, GetEntidadesPadreListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntidadesList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getEntidadesList")
    public JAXBElement<GetEntidadesList> createGetEntidadesList(GetEntidadesList value) {
        return new JAXBElement<GetEntidadesList>(_GetEntidadesList_QNAME, GetEntidadesList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinalizaAsunto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "finalizaAsunto")
    public JAXBElement<FinalizaAsunto> createFinalizaAsunto(FinalizaAsunto value) {
        return new JAXBElement<FinalizaAsunto>(_FinalizaAsunto_QNAME, FinalizaAsunto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillAsuntoRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "fillAsuntoRow")
    public JAXBElement<FillAsuntoRow> createFillAsuntoRow(FillAsuntoRow value) {
        return new JAXBElement<FillAsuntoRow>(_FillAsuntoRow_QNAME, FillAsuntoRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelevanteAsuntoGrid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getRelevanteAsuntoGrid")
    public JAXBElement<GetRelevanteAsuntoGrid> createGetRelevanteAsuntoGrid(GetRelevanteAsuntoGrid value) {
        return new JAXBElement<GetRelevanteAsuntoGrid>(_GetRelevanteAsuntoGrid_QNAME, GetRelevanteAsuntoGrid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarComentarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "insertarComentarioResponse")
    public JAXBElement<InsertarComentarioResponse> createInsertarComentarioResponse(InsertarComentarioResponse value) {
        return new JAXBElement<InsertarComentarioResponse>(_InsertarComentarioResponse_QNAME, InsertarComentarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingReunionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "pingReunionResponse")
    public JAXBElement<PingReunionResponse> createPingReunionResponse(PingReunionResponse value) {
        return new JAXBElement<PingReunionResponse>(_PingReunionResponse_QNAME, PingReunionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getUsuariosResponse")
    public JAXBElement<GetUsuariosResponse> createGetUsuariosResponse(GetUsuariosResponse value) {
        return new JAXBElement<GetUsuariosResponse>(_GetUsuariosResponse_QNAME, GetUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsistenteReunionGridResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getAsistenteReunionGridResponse")
    public JAXBElement<GetAsistenteReunionGridResponse> createGetAsistenteReunionGridResponse(GetAsistenteReunionGridResponse value) {
        return new JAXBElement<GetAsistenteReunionGridResponse>(_GetAsistenteReunionGridResponse_QNAME, GetAsistenteReunionGridResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveListaAsistentesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "saveListaAsistentesResponse")
    public JAXBElement<SaveListaAsistentesResponse> createSaveListaAsistentesResponse(SaveListaAsistentesResponse value) {
        return new JAXBElement<SaveListaAsistentesResponse>(_SaveListaAsistentesResponse_QNAME, SaveListaAsistentesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPendienteEstadisticaGridResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getPendienteEstadisticaGridResponse")
    public JAXBElement<GetPendienteEstadisticaGridResponse> createGetPendienteEstadisticaGridResponse(GetPendienteEstadisticaGridResponse value) {
        return new JAXBElement<GetPendienteEstadisticaGridResponse>(_GetPendienteEstadisticaGridResponse_QNAME, GetPendienteEstadisticaGridResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAsuntoRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "insertAsuntoRow")
    public JAXBElement<InsertAsuntoRow> createInsertAsuntoRow(InsertAsuntoRow value) {
        return new JAXBElement<InsertAsuntoRow>(_InsertAsuntoRow_QNAME, InsertAsuntoRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAsuntoRowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "insertAsuntoRowResponse")
    public JAXBElement<InsertAsuntoRowResponse> createInsertAsuntoRowResponse(InsertAsuntoRowResponse value) {
        return new JAXBElement<InsertAsuntoRowResponse>(_InsertAsuntoRowResponse_QNAME, InsertAsuntoRowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMultivaluadaRows }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getMultivaluadaRows")
    public JAXBElement<GetMultivaluadaRows> createGetMultivaluadaRows(GetMultivaluadaRows value) {
        return new JAXBElement<GetMultivaluadaRows>(_GetMultivaluadaRows_QNAME, GetMultivaluadaRows.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntidadesHijasListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getEntidadesHijasListResponse")
    public JAXBElement<GetEntidadesHijasListResponse> createGetEntidadesHijasListResponse(GetEntidadesHijasListResponse value) {
        return new JAXBElement<GetEntidadesHijasListResponse>(_GetEntidadesHijasListResponse_QNAME, GetEntidadesHijasListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntidadesHijasList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getEntidadesHijasList")
    public JAXBElement<GetEntidadesHijasList> createGetEntidadesHijasList(GetEntidadesHijasList value) {
        return new JAXBElement<GetEntidadesHijasList>(_GetEntidadesHijasList_QNAME, GetEntidadesHijasList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProyectoAsuntoGridResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getProyectoAsuntoGridResponse")
    public JAXBElement<GetProyectoAsuntoGridResponse> createGetProyectoAsuntoGridResponse(GetProyectoAsuntoGridResponse value) {
        return new JAXBElement<GetProyectoAsuntoGridResponse>(_GetProyectoAsuntoGridResponse_QNAME, GetProyectoAsuntoGridResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getUsuario")
    public JAXBElement<GetUsuario> createGetUsuario(GetUsuario value) {
        return new JAXBElement<GetUsuario>(_GetUsuario_QNAME, GetUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGridColumnsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getGridColumnsResponse")
    public JAXBElement<GetGridColumnsResponse> createGetGridColumnsResponse(GetGridColumnsResponse value) {
        return new JAXBElement<GetGridColumnsResponse>(_GetGridColumnsResponse_QNAME, GetGridColumnsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPendienteAsuntoGridResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getPendienteAsuntoGridResponse")
    public JAXBElement<GetPendienteAsuntoGridResponse> createGetPendienteAsuntoGridResponse(GetPendienteAsuntoGridResponse value) {
        return new JAXBElement<GetPendienteAsuntoGridResponse>(_GetPendienteAsuntoGridResponse_QNAME, GetPendienteAsuntoGridResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGridColumns }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getGridColumns")
    public JAXBElement<GetGridColumns> createGetGridColumns(GetGridColumns value) {
        return new JAXBElement<GetGridColumns>(_GetGridColumns_QNAME, GetGridColumns.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsuntoReunionGrid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getAsuntoReunionGrid")
    public JAXBElement<GetAsuntoReunionGrid> createGetAsuntoReunionGrid(GetAsuntoReunionGrid value) {
        return new JAXBElement<GetAsuntoReunionGrid>(_GetAsuntoReunionGrid_QNAME, GetAsuntoReunionGrid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinalizaAsuntoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "finalizaAsuntoResponse")
    public JAXBElement<FinalizaAsuntoResponse> createFinalizaAsuntoResponse(FinalizaAsuntoResponse value) {
        return new JAXBElement<FinalizaAsuntoResponse>(_FinalizaAsuntoResponse_QNAME, FinalizaAsuntoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingReunion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "pingReunion")
    public JAXBElement<PingReunion> createPingReunion(PingReunion value) {
        return new JAXBElement<PingReunion>(_PingReunion_QNAME, PingReunion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelevanteAsuntoGridResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getRelevanteAsuntoGridResponse")
    public JAXBElement<GetRelevanteAsuntoGridResponse> createGetRelevanteAsuntoGridResponse(GetRelevanteAsuntoGridResponse value) {
        return new JAXBElement<GetRelevanteAsuntoGridResponse>(_GetRelevanteAsuntoGridResponse_QNAME, GetRelevanteAsuntoGridResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateReunionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "activateReunionResponse")
    public JAXBElement<ActivateReunionResponse> createActivateReunionResponse(ActivateReunionResponse value) {
        return new JAXBElement<ActivateReunionResponse>(_ActivateReunionResponse_QNAME, ActivateReunionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePendienteRowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "updatePendienteRowResponse")
    public JAXBElement<UpdatePendienteRowResponse> createUpdatePendienteRowResponse(UpdatePendienteRowResponse value) {
        return new JAXBElement<UpdatePendienteRowResponse>(_UpdatePendienteRowResponse_QNAME, UpdatePendienteRowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgendaNuevaReunion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "agendaNuevaReunion")
    public JAXBElement<AgendaNuevaReunion> createAgendaNuevaReunion(AgendaNuevaReunion value) {
        return new JAXBElement<AgendaNuevaReunion>(_AgendaNuevaReunion_QNAME, AgendaNuevaReunion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReunionesGrid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getReunionesGrid")
    public JAXBElement<GetReunionesGrid> createGetReunionesGrid(GetReunionesGrid value) {
        return new JAXBElement<GetReunionesGrid>(_GetReunionesGrid_QNAME, GetReunionesGrid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePendienteRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "deletePendienteRow")
    public JAXBElement<DeletePendienteRow> createDeletePendienteRow(DeletePendienteRow value) {
        return new JAXBElement<DeletePendienteRow>(_DeletePendienteRow_QNAME, DeletePendienteRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsuntoReunionGridResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getAsuntoReunionGridResponse")
    public JAXBElement<GetAsuntoReunionGridResponse> createGetAsuntoReunionGridResponse(GetAsuntoReunionGridResponse value) {
        return new JAXBElement<GetAsuntoReunionGridResponse>(_GetAsuntoReunionGridResponse_QNAME, GetAsuntoReunionGridResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPendienteEstadisticaGrid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getPendienteEstadisticaGrid")
    public JAXBElement<GetPendienteEstadisticaGrid> createGetPendienteEstadisticaGrid(GetPendienteEstadisticaGrid value) {
        return new JAXBElement<GetPendienteEstadisticaGrid>(_GetPendienteEstadisticaGrid_QNAME, GetPendienteEstadisticaGrid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveListaAsistentes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "saveListaAsistentes")
    public JAXBElement<SaveListaAsistentes> createSaveListaAsistentes(SaveListaAsistentes value) {
        return new JAXBElement<SaveListaAsistentes>(_SaveListaAsistentes_QNAME, SaveListaAsistentes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaResponsableUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "verificaResponsableUsuarioResponse")
    public JAXBElement<VerificaResponsableUsuarioResponse> createVerificaResponsableUsuarioResponse(VerificaResponsableUsuarioResponse value) {
        return new JAXBElement<VerificaResponsableUsuarioResponse>(_VerificaResponsableUsuarioResponse_QNAME, VerificaResponsableUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgendaNuevaReunionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "agendaNuevaReunionResponse")
    public JAXBElement<AgendaNuevaReunionResponse> createAgendaNuevaReunionResponse(AgendaNuevaReunionResponse value) {
        return new JAXBElement<AgendaNuevaReunionResponse>(_AgendaNuevaReunionResponse_QNAME, AgendaNuevaReunionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateReunion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "activateReunion")
    public JAXBElement<ActivateReunion> createActivateReunion(ActivateReunion value) {
        return new JAXBElement<ActivateReunion>(_ActivateReunion_QNAME, ActivateReunion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMultivaluadaRowsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getMultivaluadaRowsResponse")
    public JAXBElement<GetMultivaluadaRowsResponse> createGetMultivaluadaRowsResponse(GetMultivaluadaRowsResponse value) {
        return new JAXBElement<GetMultivaluadaRowsResponse>(_GetMultivaluadaRowsResponse_QNAME, GetMultivaluadaRowsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillPendienteRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "fillPendienteRow")
    public JAXBElement<FillPendienteRow> createFillPendienteRow(FillPendienteRow value) {
        return new JAXBElement<FillPendienteRow>(_FillPendienteRow_QNAME, FillPendienteRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReunionesGridResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getReunionesGridResponse")
    public JAXBElement<GetReunionesGridResponse> createGetReunionesGridResponse(GetReunionesGridResponse value) {
        return new JAXBElement<GetReunionesGridResponse>(_GetReunionesGridResponse_QNAME, GetReunionesGridResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProyectoAsuntoGrid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getProyectoAsuntoGrid")
    public JAXBElement<GetProyectoAsuntoGrid> createGetProyectoAsuntoGrid(GetProyectoAsuntoGrid value) {
        return new JAXBElement<GetProyectoAsuntoGrid>(_GetProyectoAsuntoGrid_QNAME, GetProyectoAsuntoGrid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsistenteReunionGrid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "getAsistenteReunionGrid")
    public JAXBElement<GetAsistenteReunionGrid> createGetAsistenteReunionGrid(GetAsistenteReunionGrid value) {
        return new JAXBElement<GetAsistenteReunionGrid>(_GetAsistenteReunionGrid_QNAME, GetAsistenteReunionGrid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillAsuntoRowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "fillAsuntoRowResponse")
    public JAXBElement<FillAsuntoRowResponse> createFillAsuntoRowResponse(FillAsuntoRowResponse value) {
        return new JAXBElement<FillAsuntoRowResponse>(_FillAsuntoRowResponse_QNAME, FillAsuntoRowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPendienteRowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.reunion.bsc.penoles/", name = "insertPendienteRowResponse")
    public JAXBElement<InsertPendienteRowResponse> createInsertPendienteRowResponse(InsertPendienteRowResponse value) {
        return new JAXBElement<InsertPendienteRowResponse>(_InsertPendienteRowResponse_QNAME, InsertPendienteRowResponse.class, null, value);
    }

}
