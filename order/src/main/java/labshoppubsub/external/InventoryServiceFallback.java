package labshoppubsub.external;

import org.springframework.stereotype.Service;

@Service
public class InventoryServiceFallback implements InventoryService{
    public Inventory getInventory(Long id){
        Inventory fallbackValue = new Inventory();
        fallbackValue.setStock(1L);

        return fallbackValue;
    }
}

echo "# lab-shop-pub-sub" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/chuls-hops/lab-shop-pub-sub.git
git push -u origin main