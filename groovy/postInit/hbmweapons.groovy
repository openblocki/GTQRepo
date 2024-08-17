// Assembler recipe for HBM generic missile
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateAluminium') * 4)
        .inputs(item('hbm:hull_big_aluminium') * 2)
        .inputs(ore('componentDiode') * 4)
        .inputs(item('hbm:thruster_small') * 2)
        .inputs(item('hbm:warhead_generic_small'))
        .inputs(item('hbm:circuit_targeting_tier1') * 2)
        .inputs(item('hbm:fuel_tank_small'))  // Added fuel tank
        .fluidInputs(fluid('aluminium') * 120)
        .outputs(item('hbm:missile_generic'))
        .duration(1200).EUt(120).buildAndRegister()

// Assembler recipe for HBM buster missile
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateAluminium') * 4)
        .inputs(item('hbm:hull_big_aluminium') * 2)
        .inputs(ore('componentDiode') * 4)
        .inputs(item('hbm:thruster_small') * 2)
        .inputs(item('hbm:warhead_buster_small'))
        .inputs(item('hbm:circuit_targeting_tier1') * 2)
        .inputs(item('hbm:fuel_tank_small'))  // Added fuel tank
        .fluidInputs(fluid('aluminium') * 120)
        .outputs(item('hbm:missile_buster'))
        .duration(1200).EUt(120).buildAndRegister()

// Assembler recipe for HBM cluster missile
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateAluminium') * 4)
        .inputs(item('hbm:hull_big_aluminium') * 2)
        .inputs(ore('componentDiode') * 4)
        .inputs(item('hbm:thruster_small') * 2)
        .inputs(item('hbm:warhead_cluster_small'))
        .inputs(item('hbm:circuit_targeting_tier1') * 2)
        .inputs(item('hbm:fuel_tank_small'))  // Added fuel tank
        .fluidInputs(fluid('aluminium') * 120)
        .outputs(item('hbm:missile_cluster'))
        .duration(1200).EUt(120).buildAndRegister()

// Assembler recipe for HBM incendiary missile
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateSteel') * 2)
        .inputs(ore('plateAluminium') * 4)
        .inputs(item('hbm:hull_big_aluminium') * 2)
        .inputs(ore('componentDiode') * 4)
        .inputs(item('hbm:thruster_small') * 2)
        .inputs(item('hbm:warhead_incendiary_small'))
        .inputs(item('hbm:circuit_targeting_tier1') * 2)
        .inputs(item('hbm:fuel_tank_small'))  // Added fuel tank
        .fluidInputs(fluid('aluminium') * 120)
        .outputs(item('hbm:missile_incendiary'))
        .duration(1200).EUt(120).buildAndRegister()

// small missiles above, medium missiles below.

// Assembler recipe for HBM strong missile
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateBlackSteel') * 2)
        .inputs(ore('plateStainlessSteel') * 4)
        .inputs(item('hbm:hull_big_aluminium') * 8)
        .inputs(item('hbm:thruster_medium') * 2)
        .inputs(item('hbm:warhead_generic_medium'))
        .inputs(item('hbm:circuit_targeting_tier2') * 2)
        .fluidInputs(fluid('stainless_steel') * 120)
        .outputs(item('hbm:missile_strong'))
        .duration(1200).EUt(120).buildAndRegister()

// Assembler recipe for HBM strong incendiary missile
recipemap('assembler').recipeBuilder()
        .inputs(ore('plateBlackSteel') * 2)
        .inputs(ore('plateStainlessSteel') * 4)
        .inputs(item('hbm:hull_big_aluminium') * 8)
        .inputs(item('hbm:thruster_medium') * 2)
        .inputs(item('hbm:warhead_incendiary_medium'))
        .inputs(item('hbm:circuit_targeting_tier2') * 2)
        .fluidInputs(fluid('stainless_steel') * 120)
        .outputs(item('hbm:missile_incendiary_strong'))
        .duration(1200).EUt(120).buildAndRegister()
