Questão 1) 
a) Verdadeiro.
b) Verdadeiro.
c) Falso. Motivo: Quando um método é redefinido com a mesma assinatura, ou seja, mesmo nome e parâmetros, isso é chamado de sobrescrita ou override, não sobrecarga.


Questão 2)
O uso de private garante que os detalhes internos da superclasse sejam completamente ocultos, mesmo das subclasses, o que promove um encapsulamento mais forte e uma separação clara entre a interface pública da classe e sua implementação interna. Isso ajuda e facilita a manutenção e refatoração do código, pois mudanças internas na superclasse não afetam diretamente as subclasses. Por outro lado, protected permite que membros da superclasse sejam acessados diretamente pelas subclasses, o que pode facilitar o reaproveitamento de código e reduzir a necessidade de criar métodos auxiliares apenas para fornecer acesso a atributos. No entanto, isso também expõe detalhes internos às subclasses, tornando o sistema mais acoplado e difícil de manter a longo prazo. 


Questão 3)
Quando uma classe herda de outra, a construção de um objeto segue uma ordem hierárquica, começando sempre pela superclasse. Isso significa que, ao instanciar um objeto de uma subclasse, o construtor da superclasse é chamado antes da execução do construtor da subclasse. A chamada pode acontecer de duas formas:

  *Explícita, utilizando a palavra-chave "super()" na primeira linha do construtor da subclasse.
  *Implícita, caso o programador não inclua "super()", o compilador insere automaticamente uma chamada ao construtor padrão da superclasse.
