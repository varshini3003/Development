package Visitor;

interface ShoppingCartVisitor 
{
   
    int visit(Book book);
    int visit(Fruit fruit);
}
