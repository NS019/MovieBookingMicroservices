export interface Theatre {
    theatreId?: number;
    theatreName: string;
    address: string;
    city: City;
}

export interface City {
    cityId: number;
    cityName?: string;
}
