export class ProductResponse {
    constructor(
        public pid: number,
        public pname: string,
        public company: string,
        public category: string,
        public quantity: number,
        public price: number
      ) {}
}
