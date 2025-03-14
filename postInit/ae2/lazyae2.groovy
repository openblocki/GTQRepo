
recipemap('assembler').recipeBuilder()
        .inputs(item('threng:material', 1) * 4)
        .inputs(item('appliedenergistics2:material', 24) * 8)
        .inputs(ore('ingotFluixSteel') * 2)
        .inputs(ore('circuitEv') * 3 )
        .fluidInputs(fluid('fluix_soldering_alloy') * 144 )
        .outputs(item('threng:material', 4))
        .duration(620).EUt(220).buildAndRegister()
    
recipemap('mixer').recipeBuilder()
        .inputs(ore('dustFluix') * 2)
                .inputs(ore('dustCarbon') * 2)
                        .inputs(ore('dustSilicon') * 2)
        .outputs(item('threng:material', 1))
        .duration(120).EUt(220).buildAndRegister()
    