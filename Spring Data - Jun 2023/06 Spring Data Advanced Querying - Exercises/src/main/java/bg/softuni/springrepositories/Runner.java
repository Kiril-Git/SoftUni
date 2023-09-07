package bg.softuni.springrepositories;

import bg.softuni.springrepositories.entities.Shampoo;
import bg.softuni.springrepositories.services.ShampooService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    private ShampooService shampooService;

    public Runner(ShampooService shampooService) {
        this.shampooService = shampooService;
    }

    @Override
    public void run(String... args) throws Exception {

/*        List<Shampoo> byBrand = shampooService.findByBrand("Swiss Green Apple & Nettle");

        List<Shampoo> byBrandAndSize =
                shampooService.findByBrandAndSize("Swiss Green Apple & Nettle", Size.SMALL);

        byBrand.forEach(System.out::println);

        byBrandAndSize.forEach(System.out::println);        */

//        List<Shampoo> bySize = shampooService.findBySize(Size.MEDIUM);

//        bySize.sort(Comparator.comparing(BaseEntity::getId));

//        List<Shampoo> result = shampooService.findBySizeOrLabelIdOrderByPrice(Size.MEDIUM, 10L);


        List<Shampoo> result = shampooService.findByPriceGreaterThan(BigDecimal.valueOf(5));



        result.forEach(System.out::println );


    }
}
