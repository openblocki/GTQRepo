ore('ingotTitanium').remove(item('hbm:ingot_titanium'))
ore('Titanium').remove(item('hbm:ingot_titanium'))

// LV
recipemap('chemical_reactor').recipeBuilder()
        .inputs(item('gregtech:meta_ingot', 277) * 2 )
        .fluidInputs(fluid('oxygen') * 250 )
        .outputs(item('enderutilities:enderpart') * 2 )
        .duration(400).EUt(60).buildAndRegister()
// MV
recipemap('assembler').recipeBuilder()
         .inputs(ore('dustTin'))
         .inputs(item('gregtech:meta_dust', 320))
         .outputs(item('enderio:item_material', 22))
         .duration(200).EUt(120).buildAndRegister()

recipemap('centrifuge').recipeBuilder()
        .inputs(item('bloodmagic:component:8'))
        .chancedOutput(item('embers:shard_ember'), 500, 500)
        .duration(200).EUt(120).buildAndRegister()

recipemap('chemical_reactor').recipeBuilder()
         .inputs(ore('dustKanthal') * 2 )
         .fluidInputs(fluid('oxygen') * 200 )
         .inputs(ore('ingotSteel') * 2 )
         .outputs(item('gregtech:meta_dust', 214) * 16)
         .duration(600).EUt(120).buildAndRegister()

recipemap('assembler').recipeBuilder()
         .inputs(ore('stickStainlessSteel') * 2)
         .inputs(ore('plateAdvancedAlloy') * 4)
         .inputs(item('gregtech:machine', 998))
         .outputs(item('thermalexpansion:frame'))
         .duration(200).EUt(120).buildAndRegister()
// HV
recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustDiamond'), ore('dustLithium') * 2)
        .fluidInputs(fluid('ammonia') * 100)
        .outputs(item('libvulpes:productgem'))
        .duration(200).EUt(200).buildAndRegister()

recipemap('chemical_reactor').recipeBuilder()
        .fluidInputs(fluid('liquid_air') * 100)
        .fluidInputs(fluid('ammonia') * 250)
        .fluidOutputs(fluid('rocketfuel') * 100)
        .duration(400).EUt(200).buildAndRegister()

recipemap('assembler').recipeBuilder()
        .inputs(ore('blockGlass') * 2 )
        .inputs(ore('gemFluix') * 4 )
        .fluidInputs(fluid('radon') * 100)
        .outputs(item('appliedenergistics2:part', 16) * 32 )
        .duration(200).EUt(200).buildAndRegister()


recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustAstralStarmetal') * 6)
        .fluidInputs(fluid('plastic') * 500 )
        .fluidInputs(fluid('astralsorcery.liquidstarlight') * 120 )
        .fluidOutputs(fluid('polyastraethylene') * 240 )
        .duration(400).EUt(240).buildAndRegister()

// EV
recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('ingotSchrabidium') * 12)
        .inputs(item('hbm:powder_ice') * 4)
        .fluidInputs(fluid('iridium') * 120 )
        .fluidInputs(fluid('palladium') * 120 )
        .fluidOutputs(fluid('irschridium') * 270 )
        .duration(400).EUt(2048).buildAndRegister()

recipemap('mixer').recipeBuilder()
        .inputs(ore('dustOsmium') * 6)
        .inputs(ore('dustPalladium') * 6)
        .inputs(ore('dustIridium') * 6)
        .outputs(item('gt_aurora:ultradense_powder'))
        .duration(400).EUt(2048).buildAndRegister()

// IV
recipemap('assembler').recipeBuilder()
         .inputs(ore('plateSiliconeRubber') * 4 )
         .fluidInputs(fluid('soldering_alloy') * 72 )
         .inputs(ore('plateOsmium') * 1 )
         .inputs(ore('componentDiode') * 2 )
         .outputs(item('appliedenergistics2:material', 52) * 16 )
         .duration(200).EUt(7500).buildAndRegister()

// ZPM

recipemap('assembler').recipeBuilder()
        .inputs(item('gregtech:meta_item_1', 386) * 3)
        .inputs(item('hbm:wire_schrabidium') * 2)
        .inputs(item('hbm:wire_schrabidium') * 2)
        .inputs(ore('dustNitanium') * 24)
        .inputs(ore('circuitUv'))
        .inputs(ore('screwDarmstadtium') * 2)
        .fluidInputs(fluid('polybenzimidazole') * 120)
        .outputs(item('gt_aurora:sparkschrabidic_epoxy_resin_sheet') * 2)
        .duration(200).EUt(60000).buildAndRegister()

recipemap('chemical_reactor').recipeBuilder()
        .inputs(item('gt_aurora:sparkschrabidic_epoxy_resin_sheet') * 2)
        .fluidInputs(fluid('superschrabidium_board_reactant') * 120)
        .fluidInputs(fluid('supercoolant') * 20)
        .outputs(item('gt_aurora:sparkschrabidic_circuit_board') * 2)
        .duration(200).EUt(60000).buildAndRegister()

recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustSodium') * 2)
        .fluidInputs(fluid('sas3') * 120)
        .fluidInputs(fluid('glycerol') * 20)
        .fluidOutputs(fluid('superschrabidium_board_reactant') * 120)
        .duration(200).EUt(60000).buildAndRegister()

// UV
recipemap('assembly_line').recipeBuilder()
        .stationResearch(b -> b.researchStack(item('gregtech:meta_item_1', 647)).CWUt(8))
        .inputs(ore('screwDarmstadtium') * 12)
        .inputs(ore('screwNaquadahAlloy') * 4)
        .inputs(item('gregtech:meta_item_1', 532) * 4)
        .inputs(item('gregtech:meta_item_1', 531) * 4)
        .inputs(item('gregtech:meta_item_1', 528) * 4)
        .inputs(item('gregtech:meta_item_1', 529) * 4)
        .inputsitem('gt_aurora:sparkschrabidic_circuit_board')
        .inputs(ore('platePositronChargedEuroschidiumAlloy') * 12)
        .inputs(ore('wireFinePositronChargedEuroschidiumAlloy') * 6)
        .fluidInputs(fluid('schrabidium_based_sold_alloy') * 148 )
        .fluidInputs(fluid('polybenzimidazole') * 144 )
        .outputs(item('gt_aurora:hyperconducting_antischrabidic_circuit') * 12)
        .duration(800).EUt(524288).buildAndRegister()

recipemap('assembly_line').recipeBuilder()
        .stationResearch(b -> b.researchStack(item('hbm:capsule_sing_tiny')).CWUt(4))
        .inputs(ore('screwNaquadahAlloy') * 6)
        .inputs(ore('plateAmericium') * 4)
        .inputs(item('gregtech:meta_item_1', 532) * 2)
        .inputs(item('gregtech:meta_item_1', 531) * 2)
        .inputs(item('gt_aurora:sparkschrabidic_circuit_board') * 2)
        .inputs(ore('plateIrschidium') * 12)
        .inputs(ore('wireFineTrinium') * 6)
        .fluidInputs(fluid('schrabidium_based_sold_alloy') * 148 )
        .fluidInputs(fluid('polybenzimidazole') * 144 )
        .outputs(item('gt_aurora:hyperconducting_antischrabidic_assembly') * 12)
        .duration(800).EUt(524288).buildAndRegister()

// UHV
recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('ingotEuropium') * 6)
        .fluidInputs(fluid('amat') * 120 )
        .fluidInputs(fluid('aschrab') * 120 )
        .fluidOutputs(fluid('positron_charged_euroschidium_alloy') * 120 )
        .duration(400).EUt(620000).buildAndRegister()

recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('itemBinderComposite') * 12)
        .fluidInputs(fluid('sas3') * 120 )
        .fluidInputs(fluid('soldering_alloy') * 120 )
        .fluidInputs(fluid('darmstadtium') * 150 )
        .fluidOutputs(fluid('schrabidium_based_sold_alloy') * 250 )
        .duration(400).EUt(600000).buildAndRegister()

recipemap('chemical_reactor').recipeBuilder()
        .inputs(item('gregtech:meta_ingot', 32003) * 2 )
        .fluidInputs(fluid('aschrab') * 250 )
        .outputs(item('gregtech:meta_ingot', 32012) * 2 )
        .duration(400).EUt(2097152).buildAndRegister()


recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('ingotNeutronium') * 12)
        .fluidInputs(fluid('sas3') * 120 )
        .fluidInputs(fluid('amat') * 120 )
        .fluidInputs(fluid('darmstadtium') * 150 )
        .fluidOutputs(fluid('antineutronium') * 270 )
        .duration(400).EUt(620000).buildAndRegister()
