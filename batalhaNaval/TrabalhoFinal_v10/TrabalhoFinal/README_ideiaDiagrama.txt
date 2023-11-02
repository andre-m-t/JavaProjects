def Opcao:
	int linhas
	int colunas
	int submarinos
	int portaAvioes
	int Couracados

def Jogo:		
	Player player_1
	Player player_2
	Opcao definicoes

def Player:
	int id
	String nome
	Tabuleiro tabuleiro
	Array<Submarino> submarino
	Array<Couracado> couracado
	Array<PortaAvioes> portaAviao
	

def abstract Pecas:			def Tipo:
	int quantidade				SUBMARINO(S), COURACADO(C), PORTA_AVIAO(P)
	Tipo tipo
	


def Submarino extends Pecas:		def Couracado extends Peca:		def PortaAvioes extend Peca:
	int id					int id					int id
	Posicao posicionar			Posicao posicionar		 	Posicao posicionar				 




def Tabuleiro:				def Posicao:			def Agua extends Peca:
	int row					int row				int id
	int column				int column			Posicao posicionar

def PosicoesOcupadas:
	Peca peca
	Posicao posicao

