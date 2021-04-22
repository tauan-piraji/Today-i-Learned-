public class calculadoraBonus {
        public int bonusDoDia;

        public int bonus(Usuario u){
            int multiplicador = bonusDoDia;
            if(u.vip)
                multiplicador = 5;
            
        }
}
