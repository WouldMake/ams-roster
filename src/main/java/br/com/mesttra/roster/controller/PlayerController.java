package br.com.mesttra.roster.controller;

import br.com.mesttra.roster.entity.Player;
import br.com.mesttra.roster.service.PlayerService;
import br.com.mesttra.roster.dto.AvailabilityDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/players")
@Api(value = "Players", tags = { "Players" })
public class PlayerController {

    PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Add player",
            notes = "This method adds a new player")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Player added"),
            @ApiResponse(code = 500, message = "Internal Error"),
    })
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @GetMapping
    public List<Player> listPlayers() { return playerService.listPlayers(); }

    @GetMapping(path = "/{id}")
    public Optional<Player> getPlayer(@PathVariable Long id) {

        return playerService.getPlayer(id);
    }

    @PatchMapping(path = "/{id}")
    public Player changePlayerAvailability(@PathVariable Long id, @RequestBody AvailabilityDTO availabilityDTO) {

        return playerService.changePlayerAvailability(id, availabilityDTO.isAvailable());
    }

    @DeleteMapping(path = "/{id}")
    public String removePlayer(@PathVariable Long id) { return playerService.removePlayer(id); }

}
